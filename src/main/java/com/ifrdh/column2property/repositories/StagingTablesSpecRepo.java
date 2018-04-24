package com.ifrdh.column2property.repositories;

import com.ifrdh.column2property.models.IFREStagingColumnsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StagingTablesSpecRepo extends JpaRepository<IFREStagingColumnsEntity, Integer>{
       List<IFREStagingColumnsEntity> findAllByOrderByOriginalTableAscDataFieldOrdinalNoAsc();
}
