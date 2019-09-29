package com.jiajia.jdbc.factory.ui;


import com.jiajia.jdbc.factory.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiajia.jdbc.factory.service.AccountServiceImpl;

/**
 * 模拟web层
 */
public class Client {

    private AccountService accountService = new AccountServiceImpl();
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        AccountService accountService = (AccountService)applicationContext.getBean("accountService");
        System.out.println(accountService);

    }
}
