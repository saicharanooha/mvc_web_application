package com.spring.mvc_project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.mvc_project.dto.ProfileDTO;
import com.spring.mvc_project.entity.Register;
import com.spring.mvc_project.repository.RegisterRepo;

@Controller
public class ServiceProfile {
	@Autowired
	public RegisterRepo repo;
	
	public  Register getProfile(ProfileDTO dto) {
		
		Register register= new Register();
		register.setId(dto.getId());
		Optional<Register> r= repo.findById(register.getId());
		if(r.isPresent()) {
			return r.get();
		}
		else {
			return new Register();
			
		}
		
	}

}
