package com.itheima.demo;

public class StringDemo9 {
    public static void main(String[] args) {
        String id = "321281200506014567";

        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println(year + "年" + month + "月" + day + "日");

        Integer sex = Integer.valueOf(id.substring(16,17));

        char sexChar = id.charAt(16);
        System.out.println(sexChar);
        System.out.println(sexChar - 48);

        if(sex % 2 == 1){
            System.out.println("男");
        }else{
            System.out.println("女");
        }
        System.out.println("你的年龄是：" + (2025 - Integer.parseInt(year)));
    }
}
