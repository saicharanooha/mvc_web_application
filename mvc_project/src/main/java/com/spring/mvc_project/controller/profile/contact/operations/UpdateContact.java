package com.spring.mvc_project.controller.profile.contact.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_project.dto.RegisterDTO;
import com.spring.mvc_project.service.ProfileContacts;

@Controller
public class UpdateContact {
	@Autowired
	public ProfileContacts pc;
	@GetMapping("/updatecontact")
	public ModelAndView updateContact() {
		ModelAndView view= new ModelAndView();
		view.addObject("key", new RegisterDTO());
		view.setViewName("update_contact_info");
		return view;
	}
	
	@PostMapping("/updatecontact")
	public ModelAndView contactUpdate(@ModelAttribute("key") RegisterDTO dto) {
		String s=pc.updateContact(dto);
		ModelAndView view= new ModelAndView();
		view.addObject("result",s);
		view.setViewName("updatedcontactresult");
		return view;
					
	}
	

}
