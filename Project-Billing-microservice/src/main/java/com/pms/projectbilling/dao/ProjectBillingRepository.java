package com.pms.projectbilling.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.projectbilling.model.ProjectBilling;

@Repository
public interface ProjectBillingRepository extends JpaRepository<ProjectBilling, Integer> {

	public ProjectBilling findByBillingId(int billingId);
}
