package com.spring.mvc_project.controller.contact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contact {
	
	@GetMapping("/contact")
	public String showContactPage() {
		return "contact_page";
	}

}
