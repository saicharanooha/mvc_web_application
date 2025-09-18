package com.spring.mvc_project.controller.CreateAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_project.dto.AccountCreate;
import com.spring.mvc_project.entity.SignUpAccount;
import com.spring.mvc_project.service.accountservice.AccountService;

@Controller
public class CreateAccount {
	
	@Autowired
	private AccountService acc_service;
	@GetMapping("/account_create")
	public ModelAndView create_Account() {
		
		ModelAndView view= new ModelAndView();
		view.addObject("key", new AccountCreate());
		view.setViewName("account_create");
		return view;
			}
	
	@PostMapping("/account_create")
	public ModelAndView create_Account(@ModelAttribute("key") AccountCreate acc) {
		
		ModelAndView view= new ModelAndView();
		SignUpAccount sign_up_account=	acc_service.insert(acc);
		view.addObject("key", sign_up_account);
		view.setViewName("sign_up_result");
		return view;
	}

}
