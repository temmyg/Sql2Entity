package com.ifrdh.column2property.requirement_auto_generate;

import com.ifrdh.column2property.models.EnrichmentRequirementEntity;
import com.ifrdh.column2property.repositories.EnrichmentRequirementRepo;
import com.ifrdh.column2property.utils.SpecialColumnNameTreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EnrichRequirementDBAdaptor {

    @Autowired
    EnrichmentRequirementRepo repo;

    String columnSearch1 = "Investment Aggregation - Grouped Entity";

    public void process(){
        List<EnrichmentRequirementEntity> alllines = repo.findAll();
        List<EnrichmentRequirementEntity> newEntities = new ArrayList<>();

//        EnrichmentRequirementEntity newEnt = new EnrichmentRequirementEntity();
//        newEnt.setColumnName("aa");
//        newEnt.setIFRETableName("bb");
//        newEnt.setIsCalculated(true);
//        alllines.add(newEnt);
        int i1 = 0;
        for(EnrichmentRequirementEntity enrichEntity : alllines){
            i1++;
            String columnName = enrichEntity.getColumnName().trim();

            if(columnName.matches("(?i)assetcode")){
                String displayName = enrichEntity.getPresentationName();
                if(displayName.toLowerCase().equals("asset"))
                    columnName = "AssetCode_1";
                else if(displayName.matches("(?i)Investment Level Entity"))
                    columnName = "AssetCode_2";
            }
            else if(columnName.indexOf("/")!=-1){

                // special handling of ReportingCurrencyAL / ReportingCurrencyIL and CountryRegionIL / CountryRegionAL
                String[] colNameArr = columnName.split("/");
                List<EnrichmentRequirementEntity> newCols = new ArrayList<>();
                EnrichmentRequirementEntity addCol;
                String newName;
                for(int i=0; i<colNameArr.length; i++){
                    newName = colNameArr[i];
                    addCol = new EnrichmentRequirementEntity();
                    newName = newName.trim();
                    addCol.setColumnName(newName);
                    addCol.setIFRETableName(enrichEntity.getIFRETableName());
                    addCol.setIsCalculated(false);
                    newCols.add(addCol);
                    colNameArr[i] = newName;
                }
                newEntities.addAll(newCols);
                columnName = String.join("_", colNameArr);
                enrichEntity.setIsCalculated(true);
            }
            else if(columnName.indexOf(columnSearch1)!=-1)
            {
                columnName = SpecialColumnNameTreator.case1(columnName, columnSearch1);
            }

            if(columnName.indexOf(" ")!=-1)
            {
                columnName = columnName.replace(" ","_");
            }
            enrichEntity.setColumnName(columnName);
        }

        alllines.addAll(newEntities);
        repo.save(alllines);
    }
}
