package com.spring.mvc_project.repository.AccountRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc_project.entity.LoginDetails;

import jakarta.persistence.Entity;
@Repository
public interface LogInRepo extends CrudRepository<LoginDetails,Long> {
	
	

}
