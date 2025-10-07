package com.revature.spring.bankaccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Initialize Spring Application Context
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        // Retrieve the AccountService bean
        AccountService accountService = context.getBean("AccountService", AccountService.class);

        // Perform some operations
        accountService.printAccountBalance();
        accountService.performAccountTransaction(1500);
        accountService.applyInterest(5.0, 2);
        accountService.printAccountBalance();

        // Close the context
        ((ConfigurableApplicationContext) context).close(); 
    }
}
