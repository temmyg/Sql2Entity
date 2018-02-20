package com.ifrdh.column2property.requirement_auto_generate;


import com.ifrdh.column2property.models.NormTablesEntity;
import com.ifrdh.column2property.models.IFREStagingColumnsEntity;
import com.ifrdh.column2property.repositories.NormTablesRepo;
import com.ifrdh.column2property.repositories.StagingTablesSpecRepo;
import com.ifrdh.column2property.utils.JavaTypeFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import java.io.PrintStream;
import java.util.List;

@Component
public class StagingRequirementDBTablesGenerator {
    @Autowired
    StagingTablesSpecRepo columnsRepo;

    @Autowired
    NormTablesRepo tblsRepo;

    @Autowired
    Environment env;

    @Resource(name="entityManagerFactory")
    private EntityManagerFactory entityManagerFactory;

    public void makeTablesCreationScript(String fileName) throws Exception{
        PrintStream fileStream = new PrintStream(fileName);

        List<IFREStagingColumnsEntity> columns = columnsRepo.findAll();
        List<NormTablesEntity> tables = tblsRepo.findAll();

        String newTableName = "";
        String columnName = null;
        int colCount = 0, totNumber=0;
        for(IFREStagingColumnsEntity column : columns){
            if(!newTableName.equals(column.getTable().getTableName())) {
                colCount = 0;
                totNumber = column.getTable().getColumnNumberRequired();
                newTableName = column.getTable().getTableName();
                fileStream.println(String.format("%nCREATE TABLE %s (", newTableName));
            }
            colCount++;
            columnName = column.getColumnName().replace(' ','_');
            fileStream.print(String.format("\t%s %s ", columnName, JavaTypeFinder.convertToSQLType(column.getDataType())));
            if(colCount == totNumber)
                fileStream.println(String.format(" ) \t -- dataField: %d", column.getDataFieldOrdinalNo()));
            else
                fileStream.println(String.format(", \t -- dataField: %d", column.getDataFieldOrdinalNo()));
        }

        fileStream.close();
    }
}
