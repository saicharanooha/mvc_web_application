package com.spring.mvc_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homepage {
	
	  @GetMapping("/homepage")
	  public String home() {
		return "homepage";
		}
	  
	 

}
