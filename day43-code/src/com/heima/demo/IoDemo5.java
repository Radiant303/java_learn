package com.heima.demo;

import java.io.FileInputStream;
import java.io.IOException;

public class IoDemo5  {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day43-code\\a.txt");

        String str = "ai你呦";
        byte[] bytes = str.getBytes();
        byte[] bytes1 = str.getBytes("GBK");
        System.out.println(bytes1.length);

        //2.解码
        String s = new String(bytes1,"GBK");
        System.out.println(s);
    }
}