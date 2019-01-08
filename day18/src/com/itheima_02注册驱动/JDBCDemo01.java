package com.itheima_02注册驱动;


import com.mysql.cj.jdbc.Driver;
import org.junit.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo01 {
    //方式1.存在的问题:驱动会注册两次
    @Test
    public void test01() throws SQLException {
        //创建驱动对象
        Driver driver = new org.gjt.mm.mysql.Driver();
        //注册驱动
        DriverManager.registerDriver(driver);
    }

    //方式2:推荐使用  反射
    @Test
    public void test02() throws ClassNotFoundException {
        //注册驱动
        //类全名:包名+类名的字符串
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
}
