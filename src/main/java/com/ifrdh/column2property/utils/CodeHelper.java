package com.ifrdh.column2property.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;

@Component
public class CodeHelper {

    final String newLine = System.getProperty("line.separator");

    public static String tabs(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++)
            sb.append("\t");
        return sb.toString();
    }

    public static String findJavaDataType(String sqlDataType) {
        String resultType = null;
        switch (sqlDataType) {
            case "float":
                resultType = "Double";
                break;
            case "datetime":
                resultType = "Date";
                break;
            case "int":
                resultType = "int";
                break;
            case "varchar":
            case "nvarchar":
                resultType = "String";
                break;
            case "bit":
                resultType = "Boolean";
                break;
            default:
                resultType = "String";
        }
        return resultType;
    }

    public String generateGetter(String propertyName, String type, int initialTabNum) {
        StringBuilder sb = new StringBuilder();

        sb.append(tabs(initialTabNum));
        sb.append("public " + type + " get" + StringUtils.capitalize(propertyName));
        sb.append("() {");
        sb.append(newLine);
        sb.append(tabs(initialTabNum + 1));
        sb.append("return " + propertyName + ";");
        sb.append(newLine);
        sb.append(tabs(initialTabNum));
        sb.append("}");
        return sb.toString();
    }

    public String generateSetter(String propertyName, String type, int initialTabNum) {
        StringBuilder sb = new StringBuilder();

        sb.append(tabs(initialTabNum));
        sb.append("public void " + "set" + StringUtils.capitalize(propertyName));
        sb.append("(" + type + " " + propertyName + ") {");
        sb.append(newLine);
        sb.append(tabs(initialTabNum + 1));
        sb.append("this." + propertyName + " = " + propertyName + ";");
        sb.append(newLine);
        sb.append(tabs(initialTabNum));
        sb.append("}");
        return sb.toString();
    }

}
