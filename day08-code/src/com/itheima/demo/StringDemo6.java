package com.itheima.demo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            reverse = reverse + c;
        }
        return reverse;
    }
}
