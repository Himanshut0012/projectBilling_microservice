package com.pms.projectbilling.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectBilling {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer billingId;
	private String billingType;
	private String createdBy;
    private Date createdDate;
    private String lastUpdatedBy;
    private Date lastUpdatedDate;
    private String recordStatus;

}
