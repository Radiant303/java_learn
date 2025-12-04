package com.itheima.demo;

import java.util.Scanner;

public class StringDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true){
            System.out.println("请输入字符串:");
            str = sc.next();
            if (checkStr(str)){
                break;
            }else {
                System.out.println("输入的格式有误，请重新输入");
            }
        }
        StringBuilder numStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i)-'0';
            numStr.append(toRoman(num));
        }
        System.out.println(numStr);

    }
    //将内容变成罗马数字 1 2 3 4 5 6 7 8 9
    public static String toRoman(int number) {
        //String[]  arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        //return arr[number];

        //switch实现
        String s = switch (number){
            case 0 -> "";
            case 1 -> "Ⅰ";
            case 2 -> "Ⅱ";
            case 3 -> "Ⅲ";
            case 4 -> "Ⅳ";
            case 5 -> "Ⅴ";
            case 6 -> "Ⅵ";
            case 7 -> "Ⅶ";
            case 8 -> "Ⅷ";
            case 9 -> "Ⅸ";
            default -> s = "";
        };
        return s;
    }

    public static  boolean checkStr(String str) {
        //判断长度是否小于等于9
        if (str.length() > 9) {
            return false;
        }

        //判断是否纯数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
