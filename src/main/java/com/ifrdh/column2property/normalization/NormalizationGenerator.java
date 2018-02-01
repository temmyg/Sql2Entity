package com.ifrdh.column2property.normalization;

import com.ifrdh.column2property.models.NormTablesEntity;
import com.ifrdh.column2property.models.NormalizationTablesSpecEntity;
import com.ifrdh.column2property.repositories.NormTablesRepo;
import com.ifrdh.column2property.repositories.NormalizationTablesSpecRepo;
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

    PrintStream createScriptStream;
    FileOutputStream processOutputStream;

    List<String> uniColumnNames = new ArrayList<>();

    public NormalizationGenerator() throws Exception {

    }

    public void normalizationScriptsEntities_gen() throws Exception {

        createScriptStream = new PrintStream(env.getProperty("normalizeTablesCreation"));
        processOutputStream = new FileOutputStream(env.getProperty("normalizationProcessScript"));

        List<NormalizationTablesSpecEntity> normalizingColumns = tblSpecRepo.findAll();
        List<NormTablesEntity> tables = tblsRepo.findAll();

        writeToCreateStream(normalizingColumns);
        writeInsertions(normalizingColumns, tables);


    }

    public void writeToCreateStream(List<NormalizationTablesSpecEntity> columnList) {
        Map<String, Boolean> readColumns = new HashMap<>();
        List<Pair<String, String>> tempResult = new ArrayList<>();

        Collections.sort(columnList, new SortTablesAndColumns());

        createScriptStream.println("Use IFRDH");
        createScriptStream.println();
        createScriptStream.println(String.format("Create Table %s (", normTableName));
        createScriptStream.println(String.format("\t%s","assetcode varchar(150),"));

        String columnName = null, uniqueColumnName = null;

        for (NormalizationTablesSpecEntity column : columnList) {
            NormTablesEntity table = column.getTable();
            Boolean includeIn = table.getIsNormalizing();
            if (includeIn != null && includeIn) {
                columnName = column.getColumnName().toLowerCase();
                // columns name are not unique in NormalizationTablesSpec table
                if (columnName.equals("assetcode"))
                    continue;
                if(readColumns.containsKey(columnName)) {
                    if(!readColumns.get(columnName)) {
                        readColumns.remove(columnName);
                        readColumns.put(columnName, true);
                    }
                }
                else // if not dup, false
                    readColumns.put(columnName, false);

                uniqueColumnName = columnName + "$" + table.getTableName();
                uniColumnNames.add(uniqueColumnName);
                tempResult.add(new Pair<>(columnName, String.format("\t%s %s,", uniqueColumnName, convertToSQLType(column.getDataType()))));
            }
        }

        // Pair<String, String> elem : tempResult
        int columnsCount = tempResult.size();
        Pair<String, String> elem = null;
        for(int i=0; i<columnsCount; i++){
            uniqueColumnName = uniColumnNames.get(i);
            elem = tempResult.get(i);
            String line = elem.getValue();
            if(!readColumns.get(elem.getKey())) {
                int bgnIndex = line.indexOf("$");
                int endIndex = line.indexOf(" ", bgnIndex);
                line = line.substring(0, bgnIndex) + line.substring(endIndex);

                uniqueColumnName = uniqueColumnName.substring(0, uniqueColumnName.indexOf("$"));
                uniColumnNames.remove(i);
                uniColumnNames.add(i, uniqueColumnName);
            }
            else {
                line = line.replace("$", "_");
                uniqueColumnName = uniColumnNames.get(i).replace('$','_');
                uniColumnNames.set(i, uniqueColumnName);
            }
            createScriptStream.println(line);
        }

        createScriptStream.println(")");
    }

    public void writeInsertions(List<NormalizationTablesSpecEntity> columnList, List<NormTablesEntity> tables){
        // possibly it is already sorted
        Collections.sort(columnList, new SortTablesAndColumns());
        //sort table list
        Collections.sort(tables, new Comparator<NormTablesEntity>() {
            @Override
            public int compare(NormTablesEntity o1, NormTablesEntity o2) {
                return Integer.valueOf(o1.getOrderedId()) - Integer.valueOf(o2.getOrderedId());
            }
        });

        Byte[] buf = new Byte[100];

        StringBuilder sb = new StringBuilder();
        sb.append("select ");

        String tableName, columnName;
        for(NormalizationTablesSpecEntity column : columnList){
            tableName = column.getTable().getTableName();
            columnName = column.getColumnName().toLowerCase();
            sb.append(tableName);
            sb.append(".");
            sb.append(columnName);
        }

        sb.append(" from ");

        NormTablesEntity lastTable = null;

        for(NormTablesEntity table : tables){
            String currentTblName = table.getTableName();
            if(lastTable != null){
                sb.append(currentTblName);
                sb.append(" on ");
                sb.append(lastTable.getTableName());
                sb.append(".assetcode = ");
                sb.append(currentTblName);
                sb.append(".assetcode");
                sb.append(env.getProperty("line.separator"));
                sb.append(" join ");
            }
            else {
                sb.append(currentTblName);
                sb.append(env.getProperty("line.separator"));
                sb.append(" join ");
            }
            lastTable = table;;
        }
    }

    private String convertToSQLType(String datatype){
        String sqlType = "varchar(150)";
        switch (datatype.toLowerCase()){
            case "number":
                // default to 53 bits
                sqlType = "float";
            case "date":
                sqlType = "datetime";
            case "text":
                default:
                    break;
        }
        return sqlType;
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
