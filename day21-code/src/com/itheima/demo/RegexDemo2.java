package com.itheima.demo;

public class RegexDemo2 {
    public static void main(String[] args) {
        String regex1= "1[3-9]\\d{9}";
        System.out.println("19962979350".matches(regex1));


        //座机号码
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-23232132".matches(regex2));

        String regex3 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
    }

}
