package com.ifrdh.column2property.requirement_auto_generate;


import com.ifrdh.column2property.models.NormTablesEntity;
import com.ifrdh.column2property.models.NormalizationTablesSpecEntity;
import com.ifrdh.column2property.repositories.NormTablesRepo;
import com.ifrdh.column2property.repositories.NormalizationTablesSpecRepo;
import com.ifrdh.column2property.utils.JavaTypeFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.PrintStream;
import java.util.List;

@Component
public class RequirementDBTablesGenerator {
    @Autowired
    NormalizationTablesSpecRepo tblSpecRepo;

    @Autowired
    NormTablesRepo tblsRepo;

    @Autowired
    Environment env;

    public void makeTablesCreationScript() throws Exception{
        PrintStream fileStream = new PrintStream(env.getProperty("requirementCombinedTableCreationScript"));

        List<NormalizationTablesSpecEntity> columns = tblSpecRepo.findAll();
        List<NormTablesEntity> tables = tblsRepo.findAll();

        String newTableName = "";
        String columnName = null;
        int colCount = 0, totNumber=0;
        for(NormalizationTablesSpecEntity column : columns){
            if(!newTableName.equals(column.getTable().getTableName())) {
                colCount = 0;
                totNumber = column.getTable().getColumnNumberRequired();
                newTableName = column.getTable().getTableName();
                fileStream.println(String.format("%nCreate TABLE %s (", newTableName));
            }
            colCount++;
            columnName = column.getColumnName().replace(' ','_');
            fileStream.print(String.format("\t%s %s", columnName, JavaTypeFinder.convertToSQLType(column.getDataType())));
            if(colCount == totNumber)
                fileStream.println(")");
            else
                fileStream.println(",");
        }

        fileStream.close();
    }
}
