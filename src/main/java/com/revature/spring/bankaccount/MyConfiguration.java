package com.revature.spring.bankaccount;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackages = "com.revature.spring.bankaccount")
public class MyConfiguration {
    @Bean
    public TransactionService transactionService() {
        return new TransactionService();
    }
    @Bean
    public InterestCalculator interestCalculator() {
        return new InterestCalculator();
    }
    @Bean
    public Integer accountBalance() {
        return 5000;
    }
}
