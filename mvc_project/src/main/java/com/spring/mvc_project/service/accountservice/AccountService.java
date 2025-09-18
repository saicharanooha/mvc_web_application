package com.spring.mvc_project.service.accountservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.mvc_project.controller.CreateAccount.CreateAccount;
import com.spring.mvc_project.dto.AccountCreate;
import com.spring.mvc_project.entity.SignUpAccount;
import com.spring.mvc_project.repository.AccountRepo.SignUpRepo;

@Controller
public class AccountService {
	
	@Autowired
	private SignUpRepo signup;
	public SignUpAccount insert(AccountCreate acc1) {
		
		SignUpAccount acc= new SignUpAccount();
		acc.setName(acc1.getName());
		acc.setLastName(acc1.getLastName());
		acc.setEmailId(acc1.getEmailId());
		acc.setPhoneNumber(acc1.getPhoneNumber());
		acc.setPassword(acc1.getPassword());
		acc.setConfirmPassword(acc1.getConfirmPassword());
		return signup.save(acc);
		
		
		
	}
	
}
