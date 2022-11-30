package com.unmsm.sistemas.microservice.consultservice.repository;

import com.unmsm.sistemas.microservice.consultservice.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{
    Optional<CustomerEntity> findByDocNumber(String docNumber);
}