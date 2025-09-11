package com.spring.mvc_project.dto.family;

import java.util.UUID;

public class UpdateFamilyDTO {

	Long  id;
	String name;
	String relation;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public UpdateFamilyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UpdateFamilyDTO(Long id, String name, String relation) {
		super();
		this.id = id;
		this.name = name;
		this.relation = relation;
	}
		
}
