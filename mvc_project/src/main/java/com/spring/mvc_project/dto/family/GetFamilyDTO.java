package com.spring.mvc_project.dto.family;

import java.util.UUID;

public class GetFamilyDTO {
	
	long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public GetFamilyDTO(long id) {
		super();
		this.id = id;
	}

	public GetFamilyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
