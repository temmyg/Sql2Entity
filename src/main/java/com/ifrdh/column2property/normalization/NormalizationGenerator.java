package com.ifrdh.column2property.normalization;

import com.ifrdh.column2property.models.NormTablesEntity;
import com.ifrdh.column2property.models.NormalizationTablesSpecEntity;
import com.ifrdh.column2property.repositories.NormTablesRepo;
import com.ifrdh.column2property.repositories.NormalizationTablesSpecRepo;
import com.ifrdh.column2property.utils.JavaTypeFinder;
import com.ifrdh.column2property.utils.SizedBuffer;
import com.ifrdh.column2property.utils.SizedBufferWriter;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.*;

@Component
public class NormalizationGenerator {

    @Autowired
    NormalizationTablesSpecRepo tblSpecRepo;

    @Autowired
    NormTablesRepo tblsRepo;

    @Autowired
    Environment env;

    @Value("${normalizationTableName}")
    String normTableName;

    @Autowired
    SizedBufferWriter sizedFileWriter;

    final private String newLine = System.getProperty("line.separator");

    PrintStream createScriptStream;
    FileOutputStream processOutputStream;

    // column name, table name
    List<Pair<String, String>> uniColumnNames = new ArrayList<>();

    public NormalizationGenerator() throws Exception {

    }

    public void normalizationScriptsEntities_gen() throws Exception {

        createScriptStream = new PrintStream(env.getProperty("normalizeTablesCreation"));
        processOutputStream = new FileOutputStream(env.getProperty("normalizationProcessScript"));

        List<NormalizationTablesSpecEntity> allColumns = tblSpecRepo.findAll();
        List<NormTablesEntity> tables = tblsRepo.findAll();

        writeToCreateStream(allColumns, tables);
        makePopulateNormTableScript(allColumns, tables);

    }

    public void writeToCreateStream(List<NormalizationTablesSpecEntity> columnList, List<NormTablesEntity> tables) {
        String tableName = tables.get(0).getTableName().trim();

        Map<String, Boolean> readColumns = new HashMap<>();
        List<Pair<String, String>> tempResult = new ArrayList<>();

        Collections.sort(columnList, new SortTablesAndColumns());

        createScriptStream.println("Use IFRDH");
        createScriptStream.println("drop table " + normTableName);
        createScriptStream.println(String.format("Create Table %s (", normTableName));

        tempResult.add(new Pair<>(null, String.format("%s","assetcode varchar(150),")));
        uniColumnNames.add(new Pair<String, String>("assetcode", tableName));

        String columnName = null, distinctColumnName = null;

        for (NormalizationTablesSpecEntity column : columnList) {
            NormTablesEntity table = column.getTable();
            Boolean includeIn = table.getIsNormalizing();
            if (includeIn != null && includeIn) {
                columnName = column.getColumnName().toLowerCase();
                tableName = table.getTableName().trim();

                // columns name are not unique in NormalizationTablesSpec table
                if (columnName.equals("assetcode")){
                    continue;
                }

                if(readColumns.containsKey(columnName)) {
                    if(!readColumns.get(columnName)) {
                        readColumns.remove(columnName);
                        readColumns.put(columnName, true);
                    }
                }
                else // if not dup, false
                    readColumns.put(columnName, false);

                distinctColumnName = columnName + "$" + tableName;

                uniColumnNames.add(new Pair<String, String>(distinctColumnName, tableName));
                tempResult.add(new Pair<>(columnName, String.format("\t%s %s,", distinctColumnName, JavaTypeFinder.convertToSQLType(column.getDataType()))));
            }
        }

        // Pair<String, String> elem : tempResult
        int columnsCount = tempResult.size();
        Pair<String, String> elem = null;

        //skip assetcode
        for(int i=0; i<columnsCount; i++){

            distinctColumnName = uniColumnNames.get(i).getKey();

            elem = tempResult.get(i);
            String line = elem.getValue();
            tableName = uniColumnNames.get(i).getValue();
            String rawColumnName = elem.getKey();
            if(readColumns.containsKey(rawColumnName) && !readColumns.get(rawColumnName)) {
                int bgnIndex = line.indexOf("$");
                int endIndex = line.indexOf(" ", bgnIndex);
                line = line.substring(0, bgnIndex) + line.substring(endIndex);
                distinctColumnName = distinctColumnName.substring(0, distinctColumnName.indexOf("$"));
                uniColumnNames.remove(i);
                uniColumnNames.add(i, new Pair<String, String>(distinctColumnName, tableName));
            }
            else {
                line = line.replace("$", "_");
                distinctColumnName = uniColumnNames.get(i).getKey().replace('$','_');
                uniColumnNames.set(i, new Pair<String, String>(distinctColumnName, tableName));
            }
            createScriptStream.println(line);
        }

        createScriptStream.println(")");
    }

    public void makePopulateNormTableScript(List<NormalizationTablesSpecEntity> columnList, List<NormTablesEntity> tables) throws Exception{
        // possibly it is already sorted
        Collections.sort(columnList, new SortTablesAndColumns());
        //sort table list
        Collections.sort(tables, new Comparator<NormTablesEntity>() {
            @Override
            public int compare(NormTablesEntity o1, NormTablesEntity o2) {
                return Integer.valueOf(o1.getOrderedId()) - Integer.valueOf(o2.getOrderedId());
            }
        });

        writeInsertScript();

        // SELECT STATEMENT
        sizedFileWriter.write(String.format("%n%s",  "select "));
        sizedFileWriter.write("DIF_IFRE_Assets.assetcode, ");

        String tableName, columnName;


        List<NormalizationTablesSpecEntity> normalizingColumns = new ArrayList<>();

        int allColumnCount = 0; //assetcode already in
        for(NormalizationTablesSpecEntity column : columnList){
            Boolean include = column.getTable().getIsNormalizing();
            if(include!=null && include) {
                normalizingColumns.add(column);
                allColumnCount++;
            }
        }

        boolean assetCodeTaken = false;
        int  index = 0, validColumns = 1;
        for(NormalizationTablesSpecEntity column : normalizingColumns){
            index++;
            tableName = column.getTable().getTableName().trim();
            columnName = column.getColumnName().toLowerCase();
            if(!columnName.equals("assetcode")) {
                validColumns++;
                sizedFileWriter.write(tableName);
                sizedFileWriter.write(".");
                sizedFileWriter.write(columnName);
                if (index != allColumnCount - 1)
                    sizedFileWriter.write(", ");
            }
        }
        System.out.println(String.format("Total Select columns Count: %d", validColumns));

        // FROM CLAUSE
        sizedFileWriter.write(" from ");

        NormTablesEntity lastTable = null;

        int tblIndex = 0, validTableCount = 0;
        String joinType = "join";

        for(NormTablesEntity table : tables)
            if(table.getIsNormalizing()!=null && table.getIsNormalizing())
                validTableCount++;
        for( ; tblIndex < tables.size() ; tblIndex++){
            Boolean include = tables.get(tblIndex).getIsNormalizing();
            if(include != null && include) {
                tableName = tables.get(tblIndex).getTableName().trim();
                String currentTblName = tableName;
                if (lastTable != null) {
                    sizedFileWriter.write(currentTblName);
                    sizedFileWriter.write(" on ");
                    sizedFileWriter.write(lastTable.getTableName().trim());
                    sizedFileWriter.write(".assetcode = ");
                    sizedFileWriter.write(currentTblName);
                    sizedFileWriter.write(".assetcode");
                   // sizedFileWriter.write(newLine);

                    if (tblIndex != validTableCount - 1)
                        sizedFileWriter.write(String.format("%n%s%n", joinType));
                } else {
                    sizedFileWriter.write(currentTblName);
                    sizedFileWriter.write(newLine);
                    sizedFileWriter.write(String.format("%n%s%n", joinType));
                }
                lastTable = tables.get(tblIndex);
            }
        }

        sizedFileWriter.close();
    }

    // Insert statement
    private void writeInsertScript() throws Exception{
        sizedFileWriter.write("insert into " + normTableName + " (");

        int totalTableColumns = uniColumnNames.size();
        int count = 0;
        for(Pair<String, String> colnm : uniColumnNames) {
            count++;
            sizedFileWriter.write(String.format("%s",colnm.getKey()));

            if(count != totalTableColumns)
                sizedFileWriter.write(", ");
            else
                sizedFileWriter.write(")");
        }

        System.out.println(String.format("insert columns: %d", uniColumnNames.size()));
        //sizedFileWriter.write(String.format("%$1s", newLine));
    }
}

class SortTablesAndColumns implements Comparator<NormalizationTablesSpecEntity> {
    public int compare(NormalizationTablesSpecEntity e1, NormalizationTablesSpecEntity e2){
        String tabOrder1 = e1.getTable().getOrderedId(), tabOrder2 = e2.getTable().getOrderedId();
        if(!tabOrder1.equals(tabOrder2))
           return Integer.valueOf(e1.getTable().getOrderedId()) - Integer.valueOf(e2.getTable().getOrderedId());
        else {
            String col1 = e1.getColumnName(), col2 = e2.getColumnName();
            return col1.compareTo(col2);
        }
    }
}
