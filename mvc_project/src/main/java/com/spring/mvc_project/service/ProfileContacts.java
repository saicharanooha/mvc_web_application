package com.spring.mvc_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Controller;

import com.spring.mvc_project.dto.AddAdressDTO;
import com.spring.mvc_project.dto.RegisterDTO;
import com.spring.mvc_project.entity.Register;
import com.spring.mvc_project.repository.RegisterRepo;

import jakarta.persistence.Converts;

@Controller
public class ProfileContacts {
	
	@Autowired
	public RegisterRepo repo;
	public String addContact(AddAdressDTO dto) {
		  
		Register reg= new Register();
		reg.setFristName(dto.getFristName());
		reg.setLastName(dto.getLastName());
		reg.setEmail_id(dto.getEmailId());
		reg.setAddress(dto.getAddress());
		reg.setPhone_number(dto.getPhoneNumber());
		repo.save(reg);
		return "done sucessfully";
		
		
		
	}
	public String updateContact(RegisterDTO dto) {
		Register reg= new Register();
		reg.setFristName(dto.getFristName());
		reg.setLastName(dto.getLastName());
		reg.setEmail_id(dto.getEmailId());
		reg.setAddress(dto.getAddress());
		reg.setPhone_number(dto.getPhoneNumber());
		repo.save(reg);
		return "done sucessfully";

	}
	public String addAddress(AddAdressDTO dto) {
		Register reg= new Register();
		reg.setId(dto.getId());
		reg.setFristName(dto.getFristName());
		reg.setLastName(dto.getLastName());
		reg.setEmail_id(dto.getEmailId());
		reg.setAddress(dto.getAddress());
		reg.setPhone_number(dto.getPhoneNumber());
		repo.save(reg);
		return "done sucessfully";

	}
	public String updateAddress(RegisterDTO dto) {
		Register reg= new Register();
		reg.setFristName(dto.getFristName());
		reg.setLastName(dto.getLastName());
		reg.setEmail_id(dto.getEmailId());
		reg.setAddress(dto.getAddress());
		reg.setPhone_number(dto.getPhoneNumber());
		repo.save(reg);
		return "done sucessfully";

	}
	
	

}
