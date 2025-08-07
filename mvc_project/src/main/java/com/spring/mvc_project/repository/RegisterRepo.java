package com.spring.mvc_project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc_project.entity.Register;
@Repository
public interface RegisterRepo  extends  CrudRepository<Register,Long>{
	
	

}
