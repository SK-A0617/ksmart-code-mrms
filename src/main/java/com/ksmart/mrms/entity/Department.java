package com.ksmart.mrms.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(name = "department_code", unique = true, nullable = false)
	private String departmentCode;
	
	@Column(name = "department_name", nullable = false)
	private String departmentName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "active_status")
	private boolean activeStatus;
}
