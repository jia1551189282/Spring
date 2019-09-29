package com.jiajia.jdbc;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) throws SQLException {
        // 1 注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        // 2 获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_demo", "root", "root");
        // 3 获取到操作数据库预处理对象
        PreparedStatement preparedStatement = connection.prepareStatement("select * from account ");
        // 4 执行sql得到结果
        ResultSet resultSet = preparedStatement.executeQuery();
        // 5 遍历结果集
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));

        }
        // 6 释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
