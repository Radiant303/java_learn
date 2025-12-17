package com.itheima.demo;

import java.util.Random;

public class MathTest {
    public static void main(String[] args) {
        Math.abs(-10);
        System.out.println(Math.abs(-10));

        //取最值
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));

        //a的b次方
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(2,-2));

        //开方
        System.out.println(Math.sqrt(9));

        //随机数
        System.out.println(Math.random());
        Random r = new Random();
        //输出
        System.out.println(r.nextInt(10));


    }
}
