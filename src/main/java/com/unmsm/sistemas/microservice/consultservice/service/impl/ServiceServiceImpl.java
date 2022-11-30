package com.unmsm.sistemas.microservice.consultservice.service.impl;

import com.unmsm.sistemas.microservice.consultservice.model.ServiceEntity;
import com.unmsm.sistemas.microservice.consultservice.repository.ServiceRepository;
import com.unmsm.sistemas.microservice.consultservice.service.ServiceService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService {
    private final ServiceRepository serviceRepository;

    @Override
    public List<ServiceEntity> getByCustomerId(Integer id) {
        return serviceRepository.findByCustomerId(id);
    }

    @Override
    public ServiceEntity getByServiceId(Integer id) {
        return serviceRepository.findById(id).get();
    }
}