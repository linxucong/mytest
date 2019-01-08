package com.itheima_06jdbc事务;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC之事务管理:数据准备
 */
public class JDBCDemo01 {
    //创建账号表:账号编号,账号名称,账号余额
    @Test
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        //获得SQL语句发送对象
        Statement stmt = conn.createStatement();
        //准备SQL语句
        String sql = "create table account(id int primary key auto_increment," +
                "name varchar(20) not null unique," +
                "balance double):";

        //执行SQL语句并获得结果
        stmt.execute(sql);
        //释放资源
        stmt.close();
        conn.close();
    }

    // -- 添加两个条数据
    @Test
    public void insertData()throws Exception{
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        // 获得SQL语句发送对象
        Statement stmt = conn.createStatement();
        // 准备SQL语句
        String sql = "insert into account(name,balance) values('jack',1000),('rose',1000)";

        // 执行SQL语句并获得结果
        int row = stmt.executeUpdate(sql);
        System.out.println("row = " + row);

        // 释放资源
        stmt.close();
        conn.close();
    }
}
