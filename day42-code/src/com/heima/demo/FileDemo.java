package com.heima.demo;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("D:/");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
