package com.itheima.demo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        String userName = "zhangsan";
        String passWord = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String s = sc.nextLine();
            System.out.println("请输入密码：");
            String ss = sc.nextLine();
            if (userName.equals(s) && passWord.equals(ss)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("登录失败");
            }
            if (i == 2){
                System.out.println("错误次数过多");
            }else {
                System.out.println("剩余"+(2-i)+"次机会");
            }

        }


    }
}
