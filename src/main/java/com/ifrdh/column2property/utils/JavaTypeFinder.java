package com.ifrdh.column2property.utils;

public class JavaTypeFinder {

    public static String convertToSQLType(String datatype){
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
