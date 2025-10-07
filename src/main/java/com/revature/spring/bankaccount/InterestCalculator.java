package com.revature.spring.bankaccount;

public class InterestCalculator {
    public double calculateInterest(double amount, double rate, int time) {
        return (amount * rate * time) / 100;
    }
}
