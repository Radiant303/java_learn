package com.heima.Object1;

public class ToBinaryString {
    public static void main(String[] args) {
        int a = 10;
    }

    public static String toBinaryString(int a){
        StringBuilder str = new StringBuilder();
        while(a != 0){
            str.append(a % 2);
            a /= 2;
        }
        return str.reverse().toString().toString();
    }
}
