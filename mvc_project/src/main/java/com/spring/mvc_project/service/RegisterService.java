package com.spring.mvc_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.mvc_project.dto.RegisterDTO;
import com.spring.mvc_project.entity.Register;
import com.spring.mvc_project.repository.RegisterRepo;

@Controller
public class RegisterService {
	
	@Autowired
	public RegisterRepo registerRepo;
	public Register save(RegisterDTO dto) {
		Register register= new Register();
		register.setFristName(dto.getFristName());
		register.setLastName(dto.getLastName());
		register.setEmail_id(dto.getEmailId());
		register.setPhone_number(dto.getPhoneNumber());
		register.setAddress(dto.getAddress());
		
		return registerRepo.save(register);
		
		
	}

}
