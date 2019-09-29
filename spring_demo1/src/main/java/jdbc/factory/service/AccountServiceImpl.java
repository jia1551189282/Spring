package jdbc.factory.service;


import jdbc.factory.dao.Account;
import jdbc.factory.dao.AccountImpl;

/**
 * 业务层接口的实现类
 */
public class AccountServiceImpl implements AccountService {

    private Account account = new AccountImpl();
    public void saveAccount() {

    }
}
