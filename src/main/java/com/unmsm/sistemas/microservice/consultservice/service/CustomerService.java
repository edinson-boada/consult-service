package com.unmsm.sistemas.microservice.consultservice.service;

import com.unmsm.sistemas.microservice.consultservice.model.CustomerEntity;

public interface CustomerService {

    CustomerEntity getById(Integer id);
    boolean findByDocNumber(String docNumber);
}