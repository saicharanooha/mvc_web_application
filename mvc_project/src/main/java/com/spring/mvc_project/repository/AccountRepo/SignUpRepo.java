package com.spring.mvc_project.repository.AccountRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc_project.entity.SignUpAccount;
@Repository
public interface SignUpRepo extends JpaRepository<SignUpAccount,Long> {

}
