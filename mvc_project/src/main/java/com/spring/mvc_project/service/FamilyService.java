package com.spring.mvc_project.service;

import org.hibernate.type.descriptor.jdbc.JdbcTypeFamilyInformation.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import com.spring.mvc_project.dto.FamilyDTO;
@Controller
public class FamilyService {
	@Autowired
	public RestTemplate templete;
	public ResponseEntity<Family> save(FamilyDTO dto) {
		
		ResponseEntity<Family> f=templete.postForEntity("http://localhost:8081/family/add", dto, Family.class);
		return f;
				
	}

}
