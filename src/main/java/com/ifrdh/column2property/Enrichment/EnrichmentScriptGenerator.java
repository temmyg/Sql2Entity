package com.ifrdh.column2property.Enrichment;

import com.ifrdh.column2property.models.EnrichmentRequirementEntity;
import com.ifrdh.column2property.repositories.EnrichmentRequirementRepo;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnrichmentScriptGenerator {

    @Autowired
    EnrichmentRequirementRepo enrichmentRequirementColsRepo;

    public void makeEnrichmentScript(List<Pair<String, String>> normColumns) {
        List<EnrichmentRequirementEntity> enrichmentRequirementColumns = enrichmentRequirementColsRepo.findAll();


    }
}
