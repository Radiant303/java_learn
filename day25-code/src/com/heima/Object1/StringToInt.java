package com.heima.Object1;

public class StringToInt {
    public static void main(String[] args) {
        String s = "123";
        int num = 0;
        if(!s.matches("[1-9]\\d{0,9}")){
            System.out.println("请输入正确的数字");
        }else {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                int a = ch - '0';
                num = num * 10 + a;
            }
            System.out.println(num);
        }
    }
}
