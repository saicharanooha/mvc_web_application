package com.spring.mvc_project.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Family {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String name;
	String relation;
	public long getId() {
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
	public Family(String name, String relation) {
		super();
		this.id = id;
		this.name = name;
		this.relation = relation;
	}
	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
