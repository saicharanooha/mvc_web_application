package com.spring.mvc_project.controller.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_project.dto.RegisterDTO;
import com.spring.mvc_project.entity.Register;
import com.spring.mvc_project.service.RegisterService;

@Controller
public class Regi {
	@Autowired
	public RegisterService service;
	@GetMapping("/register")
	public ModelAndView register() {
		
		ModelAndView view = new ModelAndView();
		view.addObject("register", new RegisterDTO());
		view.setViewName("register");
		return view;
		
	}
	
	@PostMapping("/postregister")
	public ModelAndView doRegister(@ModelAttribute("Register") RegisterDTO rdto) {
		
		ModelAndView view = new ModelAndView();
		Register r=service.save(rdto);
		view.addObject("id", r.getId());
		view.setViewName("register_result");
		return view;
		
		
	}

}
