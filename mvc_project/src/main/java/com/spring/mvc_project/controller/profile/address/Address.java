package com.spring.mvc_project.controller.profile.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_project.dto.AddAdressDTO;
import com.spring.mvc_project.service.ProfileContacts;

@Controller
public class Address {
	
	@Autowired
	public ProfileContacts pc;
	@GetMapping("/address")
	public ModelAndView addAddress() {
		ModelAndView view= new ModelAndView();
		view.addObject("key", new AddAdressDTO());
		view.setViewName("address_form");
		return view;
		
	}
	
	@PostMapping("/address")
	public ModelAndView addressAdd(@ModelAttribute("key") AddAdressDTO dto) {
		
		String s=pc.addContact(dto);
		ModelAndView view= new ModelAndView();
		view.addObject("key", s);
		view.setViewName("updatedcontactresult");
		return view;
		
		
		
	}
	
	

}
