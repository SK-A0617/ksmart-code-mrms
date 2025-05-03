package com.ksmart.mrms.spec;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.ksmart.mrms.dto.DocumentSearchCriteria;
import com.ksmart.mrms.entity.Document;

import jakarta.persistence.criteria.Predicate;

public class DocumentSpecifications {
	
	public static Specification<Document> withFilters(DocumentSearchCriteria request){
		return (root, query, cb) -> {
			List<Predicate> predicates = new ArrayList<>();
			
			if(request.getDocumentNumber() != null) {
				predicates.add(cb.like(root.get("documentNumber"), "%" + request.getDocumentNumber() + "%"));
			}
			if(request.getTitle() != null) {
				predicates.add(cb.like(cb.lower(root.get("title")), "%" + request.getTitle().toLowerCase() + "%"));
			}
			if(request.getDepartmentCode() != null) {
				predicates.add(cb.equal(root.get("departmentCode").get("code"), request.getDepartmentCode()));
			}
			if(request.getDocumentType() != null) {
				predicates.add(cb.equal(root.get("documentType"), request.getDocumentType()));
			}
			if(request.getSecurityClassification() != null) {
				predicates.add(cb.equal(root.get("securityClassification"), request.getSecurityClassification()));
			}
			if(request.getWorkflowState() != null) {
				predicates.add(cb.equal(root.get("workflowState"), request.getWorkflowState()));
			}
			if(request.getCreationFrom() != null) {
				predicates.add(cb.greaterThanOrEqualTo(root.get("creationFrom"), request.getCreationFrom()));
			}
			if(request.getCreationTo() != null) {
				predicates.add(cb.greaterThanOrEqualTo(root.get("creationTo"), request.getCreationTo()));
			}
			return cb.and(predicates.toArray(new Predicate[0]));
		};
	}

}
