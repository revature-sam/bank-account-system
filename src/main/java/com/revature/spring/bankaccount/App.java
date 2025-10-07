package com.revature.spring.bankaccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        AccountService accountService = context.getBean("AccountService", AccountService.class);

        accountService.printAccountBalance();
        accountService.performAccountTransaction(1500);
        accountService.applyInterest(5.0, 2);
        accountService.printAccountBalance();
    }
}
