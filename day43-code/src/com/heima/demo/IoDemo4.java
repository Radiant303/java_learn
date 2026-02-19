package com.heima.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("day43-code\\a.txt");
            fos = new FileOutputStream("day43-code\\b.txt");
            int len;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
