package com.itheima.demo1;

public class LuoJiYunSuanFu {
    public static void main(String[] args) {
        //逻辑运算符
        //1.& 并且
        //同时满足条件
        System.out.println(true&true);//true
        System.out.println(true&false);//false
        System.out.println(false&true);//false
        System.out.println(false&false);//false

        //2.| 或
        //满足一个条件
        System.out.println(true|true);//true
        System.out.println(true|false);//true
        System.out.println(false|true);//true
        System.out.println(false|false);//false

        //3.^ 异或
        //两个条件相同
        System.out.println(true^true);//false
        System.out.println(true^false);//true
        System.out.println(false^true);//true
        System.out.println(false^false);//false

        //4.! 非
        System.out.println(!true);
        System.out.println(!false);

    }
}
