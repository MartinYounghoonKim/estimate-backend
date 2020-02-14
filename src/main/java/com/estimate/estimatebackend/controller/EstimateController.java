package com.estimate.estimatebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estimate")
public class EstimateController {

	@GetMapping
	public String getEstimate () {
		return "Hello world";
	}
}
