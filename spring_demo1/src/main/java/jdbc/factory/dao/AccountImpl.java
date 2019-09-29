package jdbc.factory.dao;

/**
 * 保存账户接口的实现类
 */
public class AccountImpl implements Account {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户");

    }
}
