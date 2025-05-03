package com.ksmart.mrms.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class DepartmentDTO {
	
	private UUID id;
	private String code;
	private String name;

}
