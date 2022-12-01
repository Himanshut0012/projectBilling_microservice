package com.pms.projectbilling.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.pms.projectbilling.dto.ProjectBillingDTO;
import com.pms.projectbilling.service.ProjectBillingService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BillingController {
	
	private final ProjectBillingService projectBillingService;
	
	@GetMapping("/{billingId}")
	public String getBillingById(@PathVariable int billingId) {
		return this.projectBillingService.getBillingById(billingId);
	}
	
	@GetMapping("/")
	public List<ProjectBillingDTO> findAllBillingType(){
		return this.projectBillingService.findAllBillingType();
	}

}
