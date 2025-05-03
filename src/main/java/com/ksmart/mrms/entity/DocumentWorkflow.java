package com.ksmart.mrms.entity;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "document_workflow")
public class DocumentWorkflow {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(name = "owner_department")
	@ManyToOne
	private Document document;
	
	@Enumerated(EnumType.STRING)
	private WorkflowState currentState;
	
	@Column(name = "last_modified_date")
	private LocalDate lastModifiedDate;
	
	@Column(name = "last_modified_by")
	private String lastModifiedBy;
	
	@Column(name = "comments")
	private String comments;
	
}
