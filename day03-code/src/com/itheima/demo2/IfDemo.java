package com.itheima.demo2;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量：");
        int wine = sc.nextInt();
        if(0<=wine&&wine<=20){
            if (18<=wine&&wine<20){
                System.out.println("可以喝");
            } else if (wine<18) {
                System.out.println("喝少点也行");
            }else
            {
                System.out.println("不可以喝");
            }
        }else {
            System.out.println("酒量输入错误");
        }

    }
}
