package com.spring.mvc_project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.spring.mvc_project.dto.family.AddFamilyDTO;
import com.spring.mvc_project.entity.Family;
import com.spring.mvc_project.repository.FamilyRepo;
@Controller
public class FamilyService {
	
	@Autowired
	private FamilyRepo familyRepo;
	
	public Family add(AddFamilyDTO dto) {
		
	Family family= new Family();
	family.setRelation(dto.getName());
	family.setRelation(dto.getRelation());
	return familyRepo.save(family);
	}
	
	
	}
