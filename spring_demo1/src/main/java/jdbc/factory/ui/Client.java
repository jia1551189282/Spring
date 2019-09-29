package jdbc.factory.ui;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟web层
 */
public class Client {

    // private AccountService accountService = new AccountServiceImpl();
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        applicationContext.getBean("accout");

    }
}
