package com.ifrdh.column2property.repositories;

import com.ifrdh.column2property.models.IFREStagingColumnsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StagingTablesSpecRepo extends JpaRepository<IFREStagingColumnsEntity, Integer>{

}
