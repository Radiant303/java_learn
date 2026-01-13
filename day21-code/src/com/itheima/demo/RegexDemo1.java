package com.itheima.demo;

public class RegexDemo1 {
    public static void main(String[] args) {
        String qq = "3511078185";
        System.out.println(qq.matches(qq));

        //转义字符
        String str = "a\\d";

    }

    public static boolean checkQQ(String qq) {
        return qq.matches("[1-9a-x]\\d{5,19}");
    }
}
