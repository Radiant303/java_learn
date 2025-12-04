package com.itheima.demo;

public class StringDemo14 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "bcdea";

        boolean b = check(strA, strB);
        System.out.println(b);
    }
    public static String rotate(String str) {
        //1.截取
        char first = str.charAt(0);
        String end = str.substring(1);
        return end + first;
    }
    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

}
