package com.itheima_05jdbc查询;


import java.sql.*;

public class JDBCDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获得连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///day18", "root", "root");
        //获得发送对象
        Statement stmt = conn.createStatement();
        //执行查询操作
        ResultSet rs = stmt.executeQuery("select * from student;");
        //使用循环获取记录数据
        while (rs.next()) {
            //根据列号获得列的值
            /*int id = rs.getInt(1);
            String name = rs.getString(2);
            String gender = rs.getString(3);
            String birthday = rs.getString(4);*/
            //根据列名获得列的值
            String id = rs.getString("id");
            String name = rs.getString("name");
            String gender = rs.getString("gender");
            Date birthday  = rs.getDate("birthday");
            System.out.println(id + "=" + name+ "=" + "=" + gender + "=" + birthday );
        }
        //关闭资源
        rs.close();
        stmt.close();
        conn.close();
    }
}
