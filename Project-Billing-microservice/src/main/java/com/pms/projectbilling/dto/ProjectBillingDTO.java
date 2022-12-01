package com.pms.projectbilling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectBillingDTO {
	private Integer id;
    private String billingType;

}
