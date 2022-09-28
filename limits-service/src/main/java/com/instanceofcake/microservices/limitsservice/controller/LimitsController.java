package com.instanceofcake.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instanceofcake.microservices.limitsservice.bean.Limits;
import com.instanceofcake.microservices.limitsservice.config.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	Configuration config;

	@GetMapping(value = "/limitsHardCoded")
	public Limits retreiveLimits() {
		return new Limits(1, 10000);

	}
	
	@GetMapping(value = "/limits")
	public Limits retreiveLimitsfromConfig() {
		return new Limits(config.getMin(), config.getMax());

	}
	
	

}
