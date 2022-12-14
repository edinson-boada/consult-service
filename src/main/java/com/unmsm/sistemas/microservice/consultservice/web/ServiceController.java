package com.unmsm.sistemas.microservice.consultservice.web;

import com.unmsm.sistemas.microservice.consultservice.model.ServiceEntity;
import com.unmsm.sistemas.microservice.consultservice.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/services")
@RequiredArgsConstructor
public class ServiceController {
    private final ServiceService serviceService;

    @GetMapping("/customer/{id}")
    public List<ServiceEntity> getByCustomerId(@PathVariable("id") Integer id) {
        return serviceService.getByCustomerId(id);
    }

    @GetMapping("/{id}")
    public ServiceEntity getByServiceId(@PathVariable("id") Integer id) {
        return serviceService.getByServiceId(id);
    }
}