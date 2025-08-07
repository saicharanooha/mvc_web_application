package com.spring.mvc_project.dto;

public class RegisterDTO {
	
	public String FristName;
	public String LastName;
	public String EmailId;
	public Long PhoneNumber;
	public String Address;
	public String getFristName() {
		return FristName;
	}
	public void setFristName(String fristName) {
		FristName = fristName;
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
	public Long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public RegisterDTO() {
		
		// TODO Auto-generated constructor stub
	}
	public RegisterDTO(String fristName, String lastName, String emailId, Long phoneNumber, String address) {
		super();
		FristName = fristName;
		LastName = lastName;
		EmailId = emailId;
		PhoneNumber = phoneNumber;
		Address = address;
	}
	
	
	

}
