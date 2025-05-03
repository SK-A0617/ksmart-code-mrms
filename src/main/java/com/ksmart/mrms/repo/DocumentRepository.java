package com.ksmart.mrms.repo;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ksmart.mrms.entity.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, UUID>, JpaSpecificationExecutor<Document> {
	
	Optional<Document> findByDocumentNumberContainingIgnoreCase(String documentNumber);
	
}
