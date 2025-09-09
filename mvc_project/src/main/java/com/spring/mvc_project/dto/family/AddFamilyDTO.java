package com.spring.mvc_project.dto.family;

public class AddFamilyDTO {
	
	String name;
	String relation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public AddFamilyDTO(String name, String relation) {
		super();
		this.name = name;
		this.relation = relation;
	}
	public AddFamilyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
