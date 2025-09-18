package com.spring.mvc_project.dto;

public class AccountCreate {
	
	String name;
	String LastName;
	String EmailId;
	long phoneNumber;
	String password;
	String confirmPassword;
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
	public AccountCreate(String name, String lastName, String emailId, long phoneNumber, String password,
			String confirmPassword) {
		super();
		this.name = name;
		LastName = lastName;
		EmailId = emailId;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
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
	public AccountCreate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
