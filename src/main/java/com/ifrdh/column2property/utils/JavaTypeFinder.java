package com.ifrdh.column2property.utils;

public class JavaTypeFinder {

    public static String convertToSQLType(String datatype){
        String sqlType = "varchar(1000)";
        switch (datatype.toLowerCase()){
            case "number":
                // default to 53 bits
                sqlType = "float";
                break;
            case "date":
                sqlType = "datetime";
                break;
            case "text":
            default:
                break;
        }
        return sqlType;
    }
}
