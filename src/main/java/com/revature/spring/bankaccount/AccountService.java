package com.revature.spring.bankaccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("AccountService")
public class AccountService {

    private TransactionService transactionService;
    private InterestCalculator interestCalculator;

    @Autowired
    public AccountService(TransactionService transactionService, InterestCalculator interestCalculator) {
        this.transactionService = transactionService;
        this.interestCalculator = interestCalculator;
    }

    public void performAccountOperation() {
        System.out.println("Performing account operations...");
        // Use transactionService and interestCalculator as needed
    }



}
