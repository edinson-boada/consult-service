package com.unmsm.sistemas.microservice.consultservice.service;

import com.unmsm.sistemas.microservice.consultservice.model.ServiceEntity;

import java.util.List;

public interface ServiceService {
    List<ServiceEntity> getByCustomerId(Integer id);
}