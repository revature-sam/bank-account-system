package com.revature.spring.bankaccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("AccountService")
public class AccountService {

    private int accountBalance;
    private TransactionService transactionService;
    private InterestCalculator interestCalculator;

    @Autowired
    public AccountService(int accountBalance, TransactionService transactionService, InterestCalculator interestCalculator) {
        this.accountBalance = accountBalance;
        this.transactionService = transactionService;
        this.interestCalculator = interestCalculator;
    }

    public void performAccountTransaction(int amount) {
        System.out.println("Balance before transaction: " + accountBalance);
        accountBalance = transactionService.makeTransaction(accountBalance, amount);
        System.out.println("New Balance after transaction: " + accountBalance);
    }

    public void applyInterest(double rate, int time) {
        double interest = interestCalculator.calculateInterest(accountBalance, rate, time);
        accountBalance += interest;
        System.out.println("Applied interest: " + interest);
        System.out.println("New Balance after applying interest: " + accountBalance);
    }

    public void printAccountBalance() {
        System.out.println("Account Balance: " + accountBalance);
    }



}
