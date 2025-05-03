package com.ksmart.mrms.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import com.ksmart.mrms.dto.DocumentSearchCriteria;
import com.ksmart.mrms.entity.Document;
import com.ksmart.mrms.repo.DocumentRepository;
import com.ksmart.mrms.service.DocumentService;
import com.ksmart.mrms.spec.DocumentSpecifications;

public class DocumentServiceImpl implements DocumentService{
	
	@Autowired
	private DocumentRepository documentRepository;

	@Override
	public Page<Document> searchDocuments(DocumentSearchCriteria criteria) {
		// TODO Auto-generated method stub
		
//		Sort sort = Sort.unsorted();
//		if(criteria.getSort() != null && !criteria.getSort().isBlank()) {
//			String[] sortParams = criteria.getSort().split(",");
//			if() {
//				
//			}
//		}
//		
//		
		PageRequest pageable =  PageRequest.of(criteria.getPage(), criteria.getSize(), Sort.by(criteria.getSort().split(",")));
		Specification<Document> spec = DocumentSpecifications.withFilters(criteria);
		return documentRepository.findAll(spec, pageable);
	}

}
