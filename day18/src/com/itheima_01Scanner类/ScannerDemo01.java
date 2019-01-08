package com.itheima_01Scanner类;


import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.nextLine();

        System.out.println("请输入年龄");
        int age = sc.nextInt();  //20回车符

        //过滤回车符
        //sc.nextLine();

        System.out.println("年龄:" + age);
        System.out.println("姓名:" + name);
    }
}
