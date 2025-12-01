package com.itheima.demo1;

import java.util.Scanner;

public class Arithmeticoperator3 {
    public static void main(String[] args) {
        //取模,获取个位十位百位
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        System.out.println(number%10);
        System.out.println(number/10%10);
        System.out.println(number/100%10);
    }
}
