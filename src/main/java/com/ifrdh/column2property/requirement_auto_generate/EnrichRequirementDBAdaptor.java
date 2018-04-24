package com.ifrdh.column2property.requirement_auto_generate;

import com.ifrdh.column2property.models.EnrichmentRequirementEntity;
import com.ifrdh.column2property.repositories.EnrichmentRequirementRepo;
import com.ifrdh.column2property.utils.SpecialColumnNameTreator;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Component
public class EnrichRequirementDBAdaptor {

    @Autowired
    EnrichmentRequirementRepo repo;

    String columnSearch1 = "Investment Aggregation - Grouped Entity";

    public void preProcess() {
        List<EnrichmentRequirementEntity> alllines = repo.findAll();
        List<EnrichmentRequirementEntity> newEntities = new ArrayList<>();

//        EnrichmentRequirementEntity newEnt = new EnrichmentRequirementEntity();
//        newEnt.setColumnName("aa");
//        newEnt.setIFRETableName("bb");
//        newEnt.setIsCalculated(true);
//        alllines.add(newEnt);
        int i1 = 0;
        String columnName, tableName;
        for (EnrichmentRequirementEntity enrichEntity : alllines) {
            i1++;
            // always lowercase
            columnName = enrichEntity.getColumnName().trim().toLowerCase();
            tableName = enrichEntity.getIFRETableName();

            if (columnName.matches("(?i)assetcode")) {
                String displayName = enrichEntity.getPresentationName();
                if (displayName.toLowerCase().equals("asset")) {
                    columnName = "assetCode_1";
                    enrichEntity.setIsCalculated(true);
                }
                else if (displayName.matches("(?i)Investment Level Entity")) {
                    columnName = "assetCode_2";
                    enrichEntity.setIsCalculated(true);
                }
            } else if (columnName.indexOf("/") != -1) {

                // special handling of ReportingCurrencyAL / ReportingCurrencyIL and CountryRegionIL / CountryRegionAL
                String[] colNameArr = columnName.split("/");
                List<EnrichmentRequirementEntity> newCols = new ArrayList<>();
                EnrichmentRequirementEntity addCol;
                String newName;
                for (int i = 0; i < colNameArr.length; i++) {
                    newName = colNameArr[i];
                    addCol = new EnrichmentRequirementEntity();
                    newName = newName.trim();
                    addCol.setColumnName(newName);   //handleKnownDuplicateColName(newName, tableName)
                    addCol.setIFRETableName(enrichEntity.getIFRETableName());
                    addCol.setIsCalculated(false);
                    newCols.add(addCol);
                    colNameArr[i] = newName;
                }
                newEntities.addAll(newCols);
                columnName = String.join("_", colNameArr);
                enrichEntity.setIFRETableName("Calculated field");
                enrichEntity.setIsCalculated(true);
            } else if (columnName.indexOf(columnSearch1) != -1) {
                columnName = SpecialColumnNameTreator.case1(columnName, columnSearch1);
            }
            else if (columnName.indexOf("allocations")!=-1 && Pattern.compile("(?i)DIF_IFRE_DF2").matcher(tableName).find()){
                columnName = "allocations_to_be_converted";
            }

            if (columnName.indexOf(" ") != -1) {
                columnName = columnName.replace(" ", "_");
            }
            enrichEntity.setColumnName(columnName);  // handleKnownDuplicateColName(columnName, tableName)
            enrichEntity.setIsCalculated(BooleanUtils.isTrue(enrichEntity.getIsCalculated()));
        }

        alllines.addAll(newEntities);
        repo.save(alllines);
    }

    // Special handling for column name of ASCAP18, ASCAP19, INVEQUIT AND INVEQUITA
    private String handleKnownDuplicateColName(String colName, String tblName) {
        tblName = tblName.trim().toUpperCase();
        if (tblName.indexOf("ASCAP19") != -1 || Pattern.compile("INVEQUIT_A$").matcher(tblName).find()) {
            if(!Pattern.compile("(?i)^acc_").matcher(colName).find())
                colName = "acc_" + colName;
        }
        if (tblName.indexOf("ASCAP18") != -1 || Pattern.compile("INVEQUIT$").matcher(tblName).find()) {
            if(!Pattern.compile("(?i)^cdn_").matcher(colName).find())
                colName = "cdn_" + colName;
        }

        return colName;
    }

}
