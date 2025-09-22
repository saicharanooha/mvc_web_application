package com.spring.mvc_project.entity;

import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginDetails {

	@Id
	long id ;
	String EmailId;
	String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginDetails(long id, String emailId, String password) {
		super();
		this.id = id;
		EmailId = emailId;
		this.password = password;
	}
	public LoginDetails() {
		super();
		Random random=new Random();
		id=random.nextLong();
		
		// TODO Auto-generated constructor stub
	}
	
	

}
