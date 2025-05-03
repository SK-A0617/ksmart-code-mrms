package com.ksmart.mrms.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import com.ksmart.mrms.entity.Document;
import com.ksmart.mrms.entity.DocumentType;
import com.ksmart.mrms.entity.SecurityClassification;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DocumentDTO {
	
	private UUID id;
	private String documentNumber;
	private String title;
	private String description;
	private LocalDate creationDate;
	private DepartmentDTO department;
	private DocumentType documentType;
	private SecurityClassification securityClassification;
	private String version;
	private WorkflowDTO workflow;
	private List<ApprovalDTO> pendingApprovals;
	
	public static DocumentDTO fromEntity(Document doc) {
		return null;
	}
	
}
