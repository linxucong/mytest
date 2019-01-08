package com.itheima_04jdbc.增删改;


import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo01 {
    @Test
    public void testCeateTable() throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        //获得SQL语句发送对象
        Statement stmt = conn.createStatement();
        //准备SQL语句
        String sql = "create table student (" +
                "id int primary key auto_increment," +
                "name varchar(20) not null," +
                "gender char(1)," +
                "birthday date);";
        //执行SQL语句并获得结果
        stmt.execute(sql);
        //释放资源
        stmt.close();
        conn.close();
    }

    //插入数据
    @Test
    public void testInsert() throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://locahost:3306/day18", "root", "root");
        //获得发送语句
        Statement stmt = conn.createStatement();
        //获得SQL语句
        String sql = "insert into student values(null,'小泽','男','1992-01-10')" +
                ",(null,'小苍','女','2000-06-10');";
        //执行SQL语句并获得结果
        int row = stmt.executeUpdate(sql);
        System.out.println("row =" + row);
        //关闭资源
        stmt.close();
        conn.close();
    }

    //修改数据
    @Test
    public void testUpdate() throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day18", "root", "root");
        //获得发送对象
        Statement stmt = conn.createStatement();
        //准备SQL语句
        String sql = "update student set name = '小苍',gender = '女' wher id  = 1;";
        //执行SQL语句并获得结果
        int row  = stmt.executeUpdate(sql);
        System.out.println("row =" + row);
        //关闭资源
        stmt.close();
        conn.close();
    }

    //删除数据
    @Test
    public void testDelete() throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3301/day18", "root", "root");
        //获得发送对象
        Statement stmt = conn.createStatement();
        //准备SQL语句
        String sql = "delete from student wher id = 1;";
        //执行SQL语句并获得结果
        int row = stmt.executeUpdate(sql);
        System.out.println("row =" + row);
        //关闭资源
        stmt.close();
        conn.close();
    }
}
