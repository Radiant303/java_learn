package com.heima.demo;

import java.io.FileInputStream;
import java.io.IOException;

public class IoDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fils = new FileInputStream("day43-code\\a.txt");

        byte[] bytes = new byte[2];

        int len = fils.read(bytes);
        //返回值是本次读取到的数据数
        System.out.println(len);
        System.out.println(new String(bytes));

        fils.close();
    }
}
