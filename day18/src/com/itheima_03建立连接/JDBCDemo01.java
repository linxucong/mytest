package com.itheima_03建立连接;


import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //创建属性集合对象
        Properties info = new Properties();
        //创建字节输入流关联配置文件
        FileInputStream fis = new FileInputStream("day18/src/jdbc.properties");
        info.load(fis);
        //关闭流
        fis.close();
        //建立连接获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day18", info);
        System.out.println(conn);
    }

    @Test
    public void test01() throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //建立连接获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day18","root","root");
        System.out.println(conn);
    }
}
