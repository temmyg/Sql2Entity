package com.ifrdh.column2property.repositories;

import com.ifrdh.column2property.models.EnrichmentRequirementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrichmentRequirementRepo extends JpaRepository<EnrichmentRequirementEntity, Integer> {
    List<EnrichmentRequirementEntity> findByOrderByOrdinalNumber();
}
