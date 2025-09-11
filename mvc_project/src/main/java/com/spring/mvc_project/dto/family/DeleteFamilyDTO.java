package com.spring.mvc_project.dto.family;

import java.util.UUID;

public class DeleteFamilyDTO {
	
	Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DeleteFamilyDTO(Long id) {
		super();
		this.id = id;
	}

	public DeleteFamilyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

		
	

}
