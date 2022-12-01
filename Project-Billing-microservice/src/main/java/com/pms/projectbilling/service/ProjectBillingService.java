package com.pms.projectbilling.service;

import java.util.List;

import com.pms.projectbilling.dto.ProjectBillingDTO;

public interface ProjectBillingService {
	
	public String getBillingById(int billingId);
	
	public List<ProjectBillingDTO> findAllBillingType();
}
