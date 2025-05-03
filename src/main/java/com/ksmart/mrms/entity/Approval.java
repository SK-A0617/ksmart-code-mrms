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
@Table(name = "approval")
public class Approval {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(name = "document_workflow")
	@ManyToOne
	private DocumentWorkflow documentWorkflow;
	
	@Column(name = "approver_department")
	@ManyToOne
	private Department ApproverDepartment;
	
	@Enumerated(EnumType.STRING)
	private ApprovalStatus approvalStatus;
	
	@Column(name = "approval_date")
	private LocalDate approvalDate;
	
	@Column(name = "approver_id")
	private String approverId;
	
}
