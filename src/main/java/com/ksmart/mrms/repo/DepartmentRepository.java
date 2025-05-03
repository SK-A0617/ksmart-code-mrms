package com.ksmart.mrms.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ksmart.mrms.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, UUID>{

}
