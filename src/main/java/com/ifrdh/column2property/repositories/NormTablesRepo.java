package com.ifrdh.column2property.repositories;

import com.ifrdh.column2property.models.NormTablesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NormTablesRepo extends JpaRepository<NormTablesEntity, String> {
}
