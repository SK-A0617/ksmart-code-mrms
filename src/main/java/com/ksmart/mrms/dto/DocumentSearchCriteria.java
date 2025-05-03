package com.ksmart.mrms.dto;

import java.time.LocalDate;

import com.ksmart.mrms.entity.DocumentType;
import com.ksmart.mrms.entity.SecurityClassification;
import com.ksmart.mrms.entity.WorkflowState;

import lombok.Data;

@Data
public class DocumentSearchCriteria {

	private String documentNumber;
	private String title;
	private String departmentCode;
	private DocumentType documentType;
	private SecurityClassification securityClassification;
	private WorkflowState workflowState;
	private LocalDate creationFrom;
	private LocalDate creationTo;
	private String pendingApprovalByDepartment;
	private int page = 0;
	private int size = 20;
	private String sort = "creationDate.desc";
	
}
