package com.jiajia.jdbc.factory.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建bean的工厂
 *
 * 为我们创建dao和service对象
 *      1 配置文件配置dao和service的唯一标识   全限定类名称（key ：value)
 *      2 读取配置文件的内容，通过反射的方式
 */
public class BeanFactory {

    private static Properties properties;

    // 定义一个map  用户存放我们创建的对象  我们称之为  容器
    private static Map<String,Object> beans;

    // 使用静态代码块为properties 对象赋值
    static{
        properties = new Properties();
        try {
            // 获取到propeties 文件的流对象
            InputStream resourceAsStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(resourceAsStream);

            // 实例化容器
            beans =new HashMap<String,Object>();
            // 获取到配置文件的中key
            Enumeration<Object> keys = properties.keys();
            // 遍历枚举
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String property = properties.getProperty(key);
                // 反射创建对象
                Object object = Class.forName(property).newInstance();
                // 将 bean放入到 容器中
                beans.put(key,object);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 根据bean的名称获取对象
     */
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }
}
