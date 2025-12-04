package com.itheima.demo;

public class StringDemo1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str = "abc";
        System.out.println(str1 == str);
        System.out.println(str1);

        String str2 = new String("abc");
        System.out.println(str2);

        //字节数组
        byte[] bytes = {97,98,99};
        String str3 = new String(bytes);
        System.out.println(str3);
        System.out.println(str3 == str1);

        //equals
        System.out.println("直接比较"+(str3 == str2));
        System.out.println("equal"+str3.equals(str2));
    }
}
