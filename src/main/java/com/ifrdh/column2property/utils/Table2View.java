package com.ifrdh.column2property.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table2View {

    static Map<String, Boolean> viewTables = new HashMap<>();

    static  {
        viewTables.put("DIF_IFRE_Ownership".toLowerCase(), true);
        viewTables.put("DIF_IFRE_AssetValuationEffDate".toLowerCase(), true);
        viewTables.put("DIF_IFRE_AssetDebtMaturityDate".toLowerCase(), true);
        viewTables.put("DIF_IFRE_AssetPredMaturityDate".toLowerCase(), true);
        viewTables.put("DIF_IFRE_Ownership_View".toLowerCase(), true);
        viewTables.put("DIF_IFRE_AssetValuationEffDate_View".toLowerCase(), true);
        viewTables.put("DIF_IFRE_AssetDebtMaturityDate_View".toLowerCase(), true);
        viewTables.put("DIF_IFRE_AssetPredMaturityDate_View".toLowerCase(), true);
    }

    public static String getViewName(String tableName){
        String tableNm = tableName.toLowerCase();
        if(viewTables.containsKey(tableNm)){
            if(tableNm.endsWith("_view"))
                return tableName;
            else
                return tableName + "_View";
        }
        else
            return tableName;
    }
}
