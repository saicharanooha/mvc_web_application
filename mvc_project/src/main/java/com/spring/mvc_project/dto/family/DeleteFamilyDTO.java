package com.spring.mvc_project.dto.family;

import java.util.UUID;

public class DeleteFamilyDTO {
	
	UUID id;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public DeleteFamilyDTO(UUID id) {
		super();
		this.id = id;
	}

	public DeleteFamilyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
