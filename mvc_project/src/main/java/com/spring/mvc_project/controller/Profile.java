package com.spring.mvc_project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_project.dto.ProfileDTO;
import com.spring.mvc_project.entity.Register;
import com.spring.mvc_project.service.ServiceProfile;
@Controller
public class Profile {
	
	@Autowired
	public ServiceProfile profile;
	
	@GetMapping("/profile")
	public ModelAndView  getProfile() {
		
		ModelAndView view= new ModelAndView();
		view.addObject("profile",new ProfileDTO());
		view.setViewName("profile_page");
		return view;
		
	}
	
	@PostMapping("/displayprofile")
	public ModelAndView displayProfile(@ModelAttribute("profile") ProfileDTO dto) {
		
		ModelAndView view = new ModelAndView();
	    Register r=profile.getProfile(dto);
		view.addObject("result_profile", r);
		view.setViewName("display_profile");
		return view;
		
		
	}

}
