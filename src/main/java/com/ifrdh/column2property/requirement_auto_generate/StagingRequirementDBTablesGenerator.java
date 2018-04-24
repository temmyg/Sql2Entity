package com.ifrdh.column2property.requirement_auto_generate;


import com.ifrdh.column2property.models.NormTablesEntity;
import com.ifrdh.column2property.models.IFREStagingColumnsEntity;
import com.ifrdh.column2property.repositories.NormTablesRepo;
import com.ifrdh.column2property.repositories.StagingTablesSpecRepo;
import com.ifrdh.column2property.utils.JavaTypeFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Component
public class StagingRequirementDBTablesGenerator {
    @Autowired
    StagingTablesSpecRepo columnsRepo;

    @Autowired
    NormTablesRepo tblsRepo;

    @Value("shadowTableCreationScript")
    String shadowTableScriptFileName;

    @Autowired
    Environment env;

    @Resource(name="entityManagerFactory")
    private EntityManagerFactory entityManagerFactory;

    public void makeTablesWithShadowCreationScript(String fileName) throws Exception{
        PrintStream fileStream = new PrintStream(fileName);
        PrintStream shadowFileStream = new PrintStream(shadowTableScriptFileName);

        //columnsRepo.findAll(); //
        List<IFREStagingColumnsEntity> columns = columnsRepo.findAllByOrderByOriginalTableAscDataFieldOrdinalNoAsc();
//        Collections.sort(columns, new Comparator<IFREStagingColumnsEntity>() {
//            @Override
//            public int compare(IFREStagingColumnsEntity o1, IFREStagingColumnsEntity o2) {
//
//                return o1.getDataFieldOrdinalNo() - o2.getDataFieldOrdinalNo();
//            }
//        });

        List<NormTablesEntity> tables = tblsRepo.findAll();

        String newTableName = "";
        String columnName = null;
        String columnDef;
        int colCount = 0, totNumber=0;
        fileStream.println(String.format("USE IFRDH%n"));

        for(IFREStagingColumnsEntity column : columns){

            String sourceTableName = column.getTable().getTableName();
            if(sourceTableName.endsWith("_View"))
                sourceTableName = sourceTableName.substring(0, sourceTableName.length() - 5);

            if(!newTableName.equals(sourceTableName)) {
                colCount = 0;
                totNumber = column.getTable().getColumnNumberRequired();
                newTableName = sourceTableName;
//
//                if(newTableName.endsWith("_View"))
//                    newTableName = newTableName.substring(0, newTableName.length() - 5);

                fileStream.println(String.format("%nDROP TABLE %s", newTableName));
                fileStream.println(String.format("%nCREATE TABLE %s (", newTableName));
                fileStream.println(String.format("\tID bigint IDENTITY(1,1) NOT NULL,"));
                fileStream.println(String.format("\tCONSTRAINT PK_%s PRIMARY KEY CLUSTERED (%s),", newTableName, "ID"));

                shadowFileStream.println(String.format("%nDROP TABLE shadow_%s", newTableName));
                shadowFileStream.println(String.format("%nCREATE TABLE Shadow_%s (", newTableName));
                shadowFileStream.println(String.format("\tImportId BigInt,"));
                shadowFileStream.println(String.format("\tID bigint,"));
            }
            colCount++;

            columnName = column.getColumnName().replace(' ','_');

            columnDef = String.format("\t%s %s", columnName, JavaTypeFinder.convertToSQLType(column.getDataType()));
            fileStream.print(columnDef);
            shadowFileStream.println(columnDef + ",");
            if(colCount == totNumber) {
                fileStream.println(String.format(" ) \t -- dataField: %d", column.getDataFieldOrdinalNo()));
                shadowFileStream.println(" ) \t");
            }
            else {
                fileStream.println(String.format(", \t -- dataField: %d", column.getDataFieldOrdinalNo()));
            }
        }

        fileStream.close();
        shadowFileStream.close();
    }
}
