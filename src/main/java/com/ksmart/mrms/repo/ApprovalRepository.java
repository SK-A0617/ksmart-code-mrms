package com.ksmart.mrms.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ksmart.mrms.entity.Approval;

public interface ApprovalRepository extends JpaRepository<Approval, UUID>{

}
