package com.spring.mvc_project;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test; // ✅ JUnit 5
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.spring.mvc_project.repository.AccountRepo.SignUpRepo;
import com.spring.mvc_project.service.accountservice.AccountService;
import com.spring.mvc_project.dto.AccountCreate;
import com.spring.mvc_project.entity.SignUpAccount;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @Mock
    private SignUpRepo acc_repo;

    @InjectMocks
    private AccountService acc_ser;

    @Test
    public void test_service() {
        SignUpAccount acc = new SignUpAccount();
       // acc.setId(1L); // Ensure getId() returns non-null

        when(acc_repo.save(any(SignUpAccount.class))).thenReturn(acc);

        AccountCreate acc1 = new AccountCreate();
        SignUpAccount acc2 = acc_ser.insert(acc1);

        assertNotNull(acc2.getId());
    }
}
