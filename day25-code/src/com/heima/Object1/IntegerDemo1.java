package com.heima.Object1;

public class IntegerDemo1 {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = new Integer(10);

        System.out.println(a==b);


        //转成十进制
        String  c =Integer.toBinaryString(100);
        System.out.println(c);

        //转成十六进制
        String d =Integer.toHexString(100);
        System.out.println(d);

        //转成八进制
        String e =Integer.toOctalString(100);
        System.out.println(e);

        //转成字符串
        String f =Integer.toString(100);
        System.out.println(f);

    }

}
