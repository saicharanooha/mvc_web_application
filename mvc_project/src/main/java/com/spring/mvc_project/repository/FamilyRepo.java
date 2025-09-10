package com.spring.mvc_project.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.mvc_project.entity.Family;
@Repository
public interface FamilyRepo  extends CrudRepository<Family,Long>{

}
