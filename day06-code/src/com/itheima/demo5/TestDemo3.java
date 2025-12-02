package com.itheima.demo5;

import java.util.Random;

public class TestDemo3 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<=25){
                chs[i] = (char)(97+i);
            }else{
                chs[i] = (char)(65+i-26);
            }

        }

        String str = "";

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(chs.length);
            char temp = chs[index];
            str = str + temp;
        }
        System.out.println(str);
    }
}
