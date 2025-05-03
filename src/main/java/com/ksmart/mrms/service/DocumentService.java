package com.ksmart.mrms.service;


import org.springframework.data.domain.Page;
import com.ksmart.mrms.dto.DocumentSearchCriteria;
import com.ksmart.mrms.entity.Document;

public interface DocumentService {

	public Page<Document> searchDocuments(DocumentSearchCriteria criteria);
	
}
