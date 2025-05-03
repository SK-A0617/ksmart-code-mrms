package com.ksmart.mrms.dto;

import java.time.LocalDate;

import com.ksmart.mrms.entity.WorkflowState;

import lombok.Data;

@Data
public class WorkflowDTO {
	
	private WorkflowState currentState;
	private LocalDate lastModifiedDate;
	private String lastModifiedBy;

}
