package com.ifrdh.column2property.requirement_auto_generate;

import com.ifrdh.column2property.models.IFREStagingColumnsEntity;
import com.ifrdh.column2property.repositories.NormTablesRepo;
import com.ifrdh.column2property.repositories.StagingTablesSpecRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NomalizationRequirementDBAdaptor {

    private static StagingTablesSpecRepo columnsRepo;

    @Autowired
    public void setColumnsRepo(StagingTablesSpecRepo repo) {
        columnsRepo = repo;
    }

    @Autowired
    private static NormTablesRepo tablesRepo;

    public static void preProcess() {
        List<IFREStagingColumnsEntity> columns = columnsRepo.findAll();
        int leng = columns.size();

        String columnName, tableName;
        IFREStagingColumnsEntity column;
        for (int i = 0; i < leng; i++) {
            column = columns.get(i);
            columnName = column.getColumnName();
            columnName = columnName.replace(' ', '_');

            tableName = column.getTable().getTableName();

            //TODO: improve column name like (TO BE CONVERTED, Investment_Aggregation_Grouped_Entity)

            //assetcode going to be not included in normalization table, it is going to be skipped in
//            if (columnName.toLowerCase() != "assetcode") {
//                switch (tableName.toUpperCase()) {
//                    case "IFRE_INVEQUIT":
//                    case "IFRE_ASCAP18":
//                        columnName = columnName.indexOf("CDN_") == 0 ? columnName : "CDN_" + columnName;
//                        break;
//                    case "IFRE_INVEQUITA":
//                    case "IFRE_ASCAP19":
//                        columnName = columnName.indexOf("CDN_") == 0 ? columnName : "CDN_" + columnName;
//                        break;
//                }
//            }
            column.setColumnName(columnName);
        }

        columnsRepo.save(columns);
    }
}
