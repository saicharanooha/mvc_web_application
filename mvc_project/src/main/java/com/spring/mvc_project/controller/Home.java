package com.spring.mvc_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
	
	@GetMapping("/menu")
	public String home() {
		return "menu";
	}

}
