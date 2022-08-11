package com.example.servicetype.Repository;

import com.example.servicetype.Entities.StageType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StageTypeRepository extends JpaRepository<StageType, Long> {
}
