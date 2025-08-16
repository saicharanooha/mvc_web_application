package com.spring.mvc_project.controller.profile.address;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_project.dto.AddAdressDTO;
@Controller
public class UpdateAddress {

	@GetMapping("/uaddress")
	public ModelAndView updateAddress() {
		
		ModelAndView view= new ModelAndView();
		view.addObject("key", new AddAdressDTO());
		view.setViewName("address_form");
		return view;
	}
}
