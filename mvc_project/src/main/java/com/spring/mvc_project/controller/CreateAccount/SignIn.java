package com.spring.mvc_project.controller.CreateAccount;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignIn {
	
	@GetMapping("/login")
	public ModelAndView signIn() {
		ModelAndView view = new ModelAndView();
		view.addObject("key", view);
		view.setViewName("login");
		return view;
	}

}
