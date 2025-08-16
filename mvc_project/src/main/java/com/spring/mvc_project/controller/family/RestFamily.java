package com.spring.mvc_project.controller.family;

import org.hibernate.type.descriptor.jdbc.JdbcTypeFamilyInformation.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_project.dto.FamilyDTO;
import com.spring.mvc_project.service.FamilyService;
@Controller

public class RestFamily {
	@Autowired
	public FamilyService fa ;
	@GetMapping("/create")
	public ModelAndView createFamilyFile() {
		
		ModelAndView view= new ModelAndView();
		view.addObject("key", new FamilyDTO());
		view.setViewName("family_file");
		return view;
	}
	@PostMapping("/familypost")
	public ModelAndView saveFile(@ModelAttribute("key") FamilyDTO dto) {
		
		ResponseEntity<Family> f=fa.save(dto);
		ModelAndView view= new ModelAndView();
		view.addObject("user", f);
		view.setViewName("family_save_results");
		return view;
		
		
	}

}
