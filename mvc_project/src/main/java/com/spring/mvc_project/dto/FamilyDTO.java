package com.spring.mvc_project.dto;

public class FamilyDTO {

	public String fullName;
	public String relation;
	long phoneNumber;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public FamilyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FamilyDTO(String fullName, String relation, long phoneNumber) {
		super();
		this.fullName = fullName;
		this.relation = relation;
		this.phoneNumber = phoneNumber;
	}
	

}
