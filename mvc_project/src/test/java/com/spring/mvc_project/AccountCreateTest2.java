package com.spring.mvc_project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.spring.mvc_project.controller.CreateAccount.CreateAccount;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(CreateAccount.class)
@ExtendWith(MockitoExtension.class)
public class AccountCreateTest2  {
	
	@Autowired
	private MockMvc mockmvc;
	@Test
	public void Test() throws Exception {
		
		mockmvc.perform(get("/account_create"))
		.andExpect(status().isOk())
		.andExpect(view().name("account_create"))
		.andExpect(model().attributeExists("key"));

	}
	

}
