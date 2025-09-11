package com.spring.mvc_project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.mvc_project.Profile;
import com.spring.mvc_project.dto.family.AddFamilyDTO;
import com.spring.mvc_project.dto.family.DeleteFamilyDTO;
import com.spring.mvc_project.dto.family.GetFamilyDTO;
import com.spring.mvc_project.dto.family.UpdateFamilyDTO;
import com.spring.mvc_project.entity.Family;
import com.spring.mvc_project.repository.FamilyRepo;
@Controller
public class FamilyService {
	
	@Autowired
	private FamilyRepo familyRepo;
	
	public Family add(AddFamilyDTO dto) {
		
	Family family= new Family();
	family.setName(dto.getName());
	family.setRelation(dto.getRelation());
	return familyRepo.save(family);
	}
	
	public Optional<Family> showProfile(GetFamilyDTO dto) {
		Family fam= new Family();
		fam.setId(dto.getId());
		return familyRepo.findById(fam.getId());
	}
	public Family add(UpdateFamilyDTO dto) {
		
		Family family= new Family();
		family.setId(dto.getId());
		family.setName(dto.getName());
		family.setRelation(dto.getRelation());
		return familyRepo.save(family);
		}
	
	public String remove(DeleteFamilyDTO dto) throws Profile {
		
		if(!familyRepo.existsById(dto.getId())) {
			 throw new Profile(" Profile not found ");
		}
		else {
			familyRepo.deleteById(dto.getId());
			return "Deleted sucessfully";

		}
				
		
	}

	
	
	}
