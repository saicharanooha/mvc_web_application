package com.spring.mvc_project.entity;

import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class SignUpAccount {
	@Id
	long id ;
	String name;
	String LastName;
	String EmailId;
	long phoneNumber;
	String password;
	String confirmPassword;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public SignUpAccount(long id, String name, String lastName, String emailId, long phoneNumber, String password,
			String confirmPassword) {
		super();
		this.id = new Random().nextLong();
		this.name = name;
		LastName = lastName;
		EmailId = emailId;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public SignUpAccount() {
		super();
		this.id = new Random().nextLong();// TODO Auto-generated constructor stub
	}
	
	
	
	

	

}
