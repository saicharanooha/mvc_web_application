package com.spring.mvc_project.controller.family;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_project.dto.family.AddFamilyDTO;
import com.spring.mvc_project.entity.Family;
import com.spring.mvc_project.service.FamilyService;

@Controller
public class FamilyController {
	@Autowired
	private FamilyService familyService;
	@GetMapping("/family_add")
	public ModelAndView addFamily() {
		ModelAndView view=  new ModelAndView();
		view.addObject("key", new AddFamilyDTO());
		view.setViewName("add_family");
		return view;
	}
	
	@PostMapping("/addfamily")
	public ModelAndView save(@ModelAttribute("key") AddFamilyDTO dto) {
		 ModelAndView view = new ModelAndView();
		    Family fam = familyService.add(dto);
		    view.addObject("key", fam);
		    view.setViewName("family_add_result");
		    return view;
		
	}

	
}
