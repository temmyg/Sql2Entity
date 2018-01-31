package com.ifrdh.column2property.normalization;

import com.ifrdh.column2property.models.NormTablesEntity;
import com.ifrdh.column2property.models.NormalizationTablesSpecEntity;
import com.ifrdh.column2property.repositories.NormTablesRepo;
import com.ifrdh.column2property.repositories.NormalizationTablesSpecRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NormalizationGenerator {

    @Autowired
    NormalizationTablesSpecRepo tblSpecRepo;

    @Autowired
    NormTablesRepo tblsRepo;

    public void normalizationScriptsEntities_gen(){
        List<NormalizationTablesSpecEntity> normalizingColumns = tblSpecRepo.findAll();
        List<NormTablesEntity> tables = tblsRepo.findAll();
    }
}
