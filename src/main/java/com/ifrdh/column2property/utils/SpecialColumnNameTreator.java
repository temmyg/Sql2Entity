package com.ifrdh.column2property.utils;

import java.util.ArrayList;
import java.util.List;

public class SpecialColumnNameTreator {
    // columnSearch like "Investment Aggregation - Grouped Entity"
    public static String case1(String line, String columnSearch) {
        String[] splited = columnSearch.split("\\s|-");
        List<String> converted = new ArrayList<>();

        for (int i = 0; i < splited.length; i++) {
            try {
                String word = splited[i];
                if (word.length() > 4)
                    converted.add(word.replace("[", "").trim());
            }
            catch (Exception e){
                int i1 = 0;
            }
        }
        int bgnIndex = line.indexOf(columnSearch);
        line = line.substring(0, bgnIndex) + String.join("_", converted) + line.substring(bgnIndex + columnSearch.length());
        return  line;
    }
}
