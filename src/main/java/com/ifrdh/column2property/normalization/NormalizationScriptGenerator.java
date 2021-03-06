package com.ifrdh.column2property.normalization;

import com.ifrdh.column2property.models.NormTablesEntity;
import com.ifrdh.column2property.models.IFREStagingColumnsEntity;
import com.ifrdh.column2property.repositories.NormTablesRepo;
import com.ifrdh.column2property.repositories.StagingTablesSpecRepo;
import com.ifrdh.column2property.utils.JavaTypeFinder;
import com.ifrdh.column2property.utils.SizedBufferWriter;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.PrintStream;
import java.util.*;

@Component
public class NormalizationScriptGenerator {
    @Value("${masterTableName}")
    String masterTabelName;

    @Autowired
    StagingTablesSpecRepo tblSpecRepo;

    @Autowired
    NormTablesRepo tblsRepo;

    @Autowired
    Environment env;

    @Value("${normalizationTableName}")
    String normTableName;

    final private String newLine = System.getProperty("line.separator");

    PrintStream createScriptStream;

    @Autowired
    @Qualifier("normSizedWriter") //
    SizedBufferWriter sizedFileWriter;
    //FileOutputStream processOutputStream;

    //unique column name, table name, sqlType
    List<Pair<String, Pair<String, String>>> uniColumnNames = new ArrayList<>();

    public List<Pair<String, Pair<String, String>>> getUniColumnNames() {
        return uniColumnNames;
    }

    public NormalizationScriptGenerator() throws Exception {

    }

    public void generateNormalizationScripts() throws Exception {

        createScriptStream = new PrintStream(env.getProperty("normalizeTablesCreation"));
        //processOutputStream = new FileOutputStream(env.getProperty("normalizationProcessScript"));

        List<IFREStagingColumnsEntity> allColumns = tblSpecRepo.findAll();
        List<NormTablesEntity> tables = tblsRepo.findAll();

        makeCreateTableScript(allColumns, tables);
        makePopulateNormTableScript(allColumns, tables);

    }

    public void makeCreateTableScript(List<IFREStagingColumnsEntity> columnList, List<NormTablesEntity> tables) {

        String tableName;
        Map<String, Boolean> readColumns = new HashMap<>();
        List<Pair<String, String>> tempResult = new ArrayList<>();

        Collections.sort(columnList, new SortTablesAndColumns());
//        tableName = tables.get(0).getTableName().trim();

        createScriptStream.println("Use IFRDH");
        createScriptStream.println("drop table " + normTableName);
        createScriptStream.println(String.format("Create Table %s (", normTableName));
        createScriptStream.println("ImportId bigint,");
        tempResult.add(new Pair<>(null, String.format("%s","assetcode varchar(1000),")));
        uniColumnNames.add(new Pair<String, Pair<String,String>>("assetcode", new Pair<>(masterTabelName.toLowerCase(), "varchar(1000)")));

        String columnName = null, distinctColumnName = null, sqlType;

        for (IFREStagingColumnsEntity column : columnList) {
            NormTablesEntity table = column.getTable();
            Boolean includeIn = table.getIsNormalizing();
            if (includeIn != null && includeIn) {

                //always add lowercased column name
                columnName = column.getColumnName().toLowerCase();
                tableName = table.getTableName().trim().toLowerCase();

                // columns name are not unique in NormalizationTablesSpec table
                if (columnName.equals("assetcode")){
                    continue;
                }
                // flag duplicate columnName to true
                if(readColumns.containsKey(columnName)) {
                    // flag true for duplicate column
                    if(!readColumns.get(columnName)) {
                        readColumns.remove(columnName);
                        readColumns.put(columnName, true);
                    }
                }
                else // if not dup, false
                    readColumns.put(columnName, false);

                distinctColumnName = columnName + "$" + tableName;
                sqlType = JavaTypeFinder.convertToSQLType(column.getDataType());

                uniColumnNames.add(new Pair<String, Pair<String, String> >(distinctColumnName, new Pair<>(tableName, sqlType)));
                tempResult.add(new Pair<>(columnName, String.format("\t%s %s,", distinctColumnName, sqlType)));
            }
        }

        Pair<String, String> lastLine = tempResult.get(tempResult.size()-1);
        String replacedVal = lastLine.getValue().replace(",","");
        tempResult.remove(tempResult.size() - 1);
        tempResult.add(new Pair<>(lastLine.getKey(), replacedVal));

        // Pair<String, String> elem : tempResult
        int columnsCount = tempResult.size();
        Pair<String, String> elem = null;

        //skip assetcode
        for(int i=0; i<columnsCount; i++){

            distinctColumnName = uniColumnNames.get(i).getKey();

            elem = tempResult.get(i);
            String line = elem.getValue();

            tableName = uniColumnNames.get(i).getValue().getKey();
            String rawColumnName = elem.getKey();

            try {
                // if the column name has no duplicate
                if (readColumns.containsKey(rawColumnName) && !readColumns.get(rawColumnName)) {
                    int bgnIndex = line.indexOf("$");
                    int endIndex = line.indexOf(" ", bgnIndex);

                    // transform column name for normalization table
                    line = line.substring(0, bgnIndex) + line.substring(endIndex);

                    // no duplicate, remove $Table_Name
                    distinctColumnName = distinctColumnName.substring(0, distinctColumnName.indexOf("$"));
                    elem = uniColumnNames.get(i).getValue();
                    uniColumnNames.remove(i);
                    uniColumnNames.add(i, new Pair<String, Pair<String, String>>(distinctColumnName, elem));
                } else {  // has duplicate
                    line = line.replace("$", "_");
                    distinctColumnName = uniColumnNames.get(i).getKey().replace('$', '_');
                    uniColumnNames.set(i, new Pair<String, Pair<String, String>>(distinctColumnName, uniColumnNames.get(i).getValue()));
                }
            }
            catch (Exception ex){
                int i2 = 0;
            }
            createScriptStream.println(line);
        }

        createScriptStream.println(")");
    }

    public void makePopulateNormTableScript(List<IFREStagingColumnsEntity> columnList, List<NormTablesEntity> tables) throws Exception{
        // possibly it is already sorted
        Collections.sort(columnList, new SortTablesAndColumns());
        //sort table list
        Collections.sort(tables, new Comparator<NormTablesEntity>() {
            @Override
            public int compare(NormTablesEntity o1, NormTablesEntity o2) {
                return Integer.valueOf(o1.getOrderedId()) - Integer.valueOf(o2.getOrderedId());
            }
        });

        sizedFileWriter.write(String.format("ALTER procedure [dbo].[NormalizationPhaseII] as%n"));
        sizedFileWriter.write(String.format("begin%n"));
        sizedFileWriter.write(String.format("set nocount on%n"));
        sizedFileWriter.write(String.format("declare @importid bigint%n"));
        sizedFileWriter.write(String.format(" select  @importid = max(importid) from dbo.IFRDH_Import where importtype = 'REImport'%n%n"));

        //****** Insert Statement
        writeInsertScript();

        // SELECT STATEMENT
        sizedFileWriter.write(String.format("%n%s",  "select "));
        sizedFileWriter.write("@importid,");
        sizedFileWriter.write("DIF_IFRE_Assets.assetcode, ");

        String tableName, columnName;

        List<IFREStagingColumnsEntity> normalizingColumns = new ArrayList<>();

        int allColumnCount = 0; //assetcode already in
        for(IFREStagingColumnsEntity column : columnList){

            Boolean include = column.getTable().getIsNormalizing();

            // table should be included in the normalization table
            if(include!=null && include) {
                normalizingColumns.add(column);
                allColumnCount++;
            }
        }

        boolean assetCodeTaken = false;
        int  index = 0, validColumns = 1;
        for(IFREStagingColumnsEntity column : normalizingColumns){
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

        int tblIndex = 0, validTableCount = 0, processedCount = 0;
        String joinType = "left join";

        for(NormTablesEntity table : tables)
            if(table.getIsNormalizing()!=null && table.getIsNormalizing())
                validTableCount++;
        for( ; tblIndex < tables.size() ; tblIndex++){
            Boolean include = tables.get(tblIndex).getIsNormalizing();
            if(include != null && include) {
                processedCount++;
                String currentTblName = tables.get(tblIndex).getTableName().trim();
                if (lastTable != null) {
                    String lastTableName = lastTable.getTableName().trim();
//                    System.out.printf("last: %1s current: %2s%n",
//                            lastTableName.trim(), currentTblName.trim());   //String.format("last: %1$s current: ", lastTable.getTableName()));
                    sizedFileWriter.write(currentTblName);
                    sizedFileWriter.write(" on ");
                    sizedFileWriter.write("DIF_IFRE_ASSETS");  //sizedFileWriter.write(lastTableName);
                    sizedFileWriter.write(".assetcode = ");
                    sizedFileWriter.write(currentTblName);
                    sizedFileWriter.write(".assetcode");
                   // sizedFileWriter.write(newLine);

                    if (processedCount != validTableCount )   //tblIndex != validTableCount - 1)
                        sizedFileWriter.write(String.format(" %s%n", joinType));
                } else { // first table
                    sizedFileWriter.write(currentTblName);
                    sizedFileWriter.write(String.format(" %s%n", joinType));
                }
                lastTable = tables.get(tblIndex);
            }
        }
        sizedFileWriter.write(String.format("%nend%n"));
        sizedFileWriter.close();
    }

    // Insert statement
    private void writeInsertScript() throws Exception{
        sizedFileWriter.write("insert into " + normTableName + " (");
        sizedFileWriter.write("importid, ");
        int totalTableColumns = uniColumnNames.size();
        int count = 0;
        for(Pair<String, Pair<String, String>> colnm : uniColumnNames) {
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

class SortTablesAndColumns implements Comparator<IFREStagingColumnsEntity> {
    public int compare(IFREStagingColumnsEntity e1, IFREStagingColumnsEntity e2){
        String tabOrder1 = e1.getTable().getOrderedId(), tabOrder2 = e2.getTable().getOrderedId();
        if(!tabOrder1.equals(tabOrder2))
           return Integer.valueOf(e1.getTable().getOrderedId()) - Integer.valueOf(e2.getTable().getOrderedId());
        else {
            String col1 = e1.getColumnName(), col2 = e2.getColumnName();
            return col1.compareTo(col2);
        }
    }
}
