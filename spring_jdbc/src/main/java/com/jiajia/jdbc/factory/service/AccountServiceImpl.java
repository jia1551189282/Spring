package com.jiajia.jdbc.factory.service;

import com.jiajia.jdbc.factory.dao.Account;
import com.jiajia.jdbc.factory.dao.AccountImpl;

/**
 * 业务层接口的实现类
 */
public class AccountServiceImpl implements AccountService {

    private Account account = new AccountImpl();
    @Override
    public void saveAccount() {

    }
}
