package com.unmsm.sistemas.microservice.consultservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConsultServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultServiceApplication.class, args);
	}

}
