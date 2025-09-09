package com.spring.mvc_project.controller.family;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_project.dto.family.AddFamilyDTO;

@Controller

public class Family {
	
	@GetMapping("/family_add")
	public ModelAndView addFamily() {
		ModelAndView view=  new ModelAndView();
		view.addObject("key", new AddFamilyDTO());
		view.setViewName("add_family");
		return view;
	}

}
