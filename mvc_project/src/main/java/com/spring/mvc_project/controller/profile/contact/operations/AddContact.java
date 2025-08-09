package com.spring.mvc_project.controller.profile.contact.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_project.dto.RegisterDTO;
import com.spring.mvc_project.service.ProfileContacts;

@Controller
public class AddContact {
	@Autowired
	public ProfileContacts pcontacts;
	@GetMapping("/addcontact")
	public ModelAndView addContact() {
		ModelAndView view = new ModelAndView();
		view.addObject("key", new RegisterDTO());
		view.setViewName("profile_contacts");
		return view;
	}
	
	@PostMapping("/updateprofile")
	public ModelAndView processAddContact(@ModelAttribute("key") RegisterDTO dto) {
		String msg=pcontacts.addContact(dto);
		ModelAndView view= new ModelAndView();
		view.addObject("key", msg);
		view.setViewName("profile_contact_results");
		return view;
		
	}

}
