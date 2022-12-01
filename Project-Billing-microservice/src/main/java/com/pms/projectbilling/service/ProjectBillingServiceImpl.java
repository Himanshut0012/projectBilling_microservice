package com.pms.projectbilling.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.pms.projectbilling.dao.ProjectBillingRepository;
import com.pms.projectbilling.dto.ProjectBillingDTO;
import com.pms.projectbilling.model.ProjectBilling;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectBillingServiceImpl implements ProjectBillingService{

	private final ProjectBillingRepository projectBillingRepository;
	private final ModelMapper modelMapper;

	@Override
	public String getBillingById(int billingId) {
		ProjectBilling projectBilling=this.projectBillingRepository.findByBillingId(billingId);
		return projectBilling.getBillingType();
	}

	@Override
	public List<ProjectBillingDTO> findAllBillingType() {
		List<ProjectBilling> projectBillings=this.projectBillingRepository.findAll();
		List<ProjectBillingDTO> projectBillingDTOs= projectBillings.stream().map(projectBilling -> modelMapper.map(projectBilling, ProjectBillingDTO.class)).toList();
		return projectBillingDTOs;
	}
	
	
}
