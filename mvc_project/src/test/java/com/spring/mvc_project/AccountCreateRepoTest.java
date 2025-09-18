package com.spring.mvc_project;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.spring.mvc_project.repository.AccountRepo.SignUpRepo;
import com.spring.mvc_project.entity.SignUpAccount;

@DataJpaTest
public class AccountCreateRepoTest {

    @Autowired
    private SignUpRepo repo;

    @Test
    public void test_saveAccount() {
        SignUpAccount account = new SignUpAccount();
        // set required fields on account if needed
        account.setName("Test Name");

        SignUpAccount savedAccount = repo.save(account);

        assertNotNull(savedAccount);
        assertNotNull(savedAccount.getId());  // ID should be generated on save
    }
}
