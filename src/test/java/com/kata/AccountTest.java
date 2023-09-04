package com.kata;

import controller.Account;
import exception.BalanceException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AccountTest {

//    @InjectMocks
//    private BankController bankController;

//    @Test
//    void should_return_200_when_deposit_amount_is_positive(){
//        ResponseEntity<String> responseEntity = bankController.deposit(5000d);
//        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
//    }


//    Feature2: Deposit API
//
//#Scenario 1 : The deposit api is called with an account identifier and an amount
//    When the deposit api is called with an existing account identifier and an amount > 0
//    Then the bank account balance is increased with the given amount, and the API creates a deposit transaction and returns its details
//
//
//#Scenario 2: The deposit api is called with an account identifier and an amount > 10K
//    When the deposit api is called with an existing account identifier and an amount > 10K
//    Then the bank account balance is increased with the given amount, and the API creates a deposit transaction with a flag "rich = true" and returns its details
//    Feature: Withdrawal API
//
//#Scenario 1 : The withdrawal api is called with an account identifier and an amount
//    When the withdrawal api is called with an existing account identifier and an amount =< bank account balance
//    Then the bank account balance is decreased with the given amount, and the API creates a withdrawal transaction and returns its details
//
//
//#Scenario 2 : The withdrawal api is called with an account identifier and an amount
//    When the withdrawal api is called with an existing account identifier and an amount > daily withdrawal limit (2K)
//    Then the API throws an exception "The daily withdrawal limit of 2K cannot be exceeded"
    @Test
    public void testDepositAccount(){

        Account account = Account.builder().cin("cin123").build();
        account.addAmount("cin123" , 200);

    }

    @Test
    public void testDepositAccountWithBalance(){

        Account account = Account.builder().cin("cin123").build();
        account.addAmount("cin123" , 200);

    }

    @Test
    public void testAccountAddRichFlag() {
        Account account = Account.builder().cin("cin456").build();
        boolean isRich = account.addAmount("cin456", 10500);
        assertTrue(isRich);
    }

    @Test
    public void withdrawal() throws BalanceException {
        Account account = Account.builder().cin("cin123").balance(5000d).isRich(true).build();
        account.withdrawal("cin123", 2000d);
    }







}
