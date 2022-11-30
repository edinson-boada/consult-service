package com.unmsm.sistemas.microservice.consultservice.repository;

import com.unmsm.sistemas.microservice.consultservice.model.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Integer>{
    List<ServiceEntity> findByCustomerId(Integer id);
}