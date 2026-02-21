package com.heima.demo;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day44-code\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day44-code\\b.txt"));
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        try {
            bis.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
