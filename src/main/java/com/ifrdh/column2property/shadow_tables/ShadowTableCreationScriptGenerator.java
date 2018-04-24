package com.ifrdh.column2property.shadow_tables;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.PrintStream;

@Component
public class ShadowTableCreationScriptGenerator {

    private static String[] tableNames;

    private static String fileName;

    @Resource(name = "ImportingTableNames")
    private void setTableNames(String[] names){
        tableNames = names;
    }

    @Value("${shadowTableCreationScript}")
    private void setFileName(String filename){
        fileName = filename;
    }

    public static void writeScriptFiles() throws Exception{
        PrintStream fwriter = new PrintStream(fileName);

        fwriter.append("Use IFRDH");
        for(String table : tableNames){
            fwriter.println(String.format("Drop Table %s;", table));
        }

        fwriter.println();
        for (String table: tableNames){
            fwriter.println(String.format("Select * Into shadow_%1$s From %1$s where 1=2", table));
        }
        fwriter.close();
    }
}
