package com.heima.demo;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day44-code\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day44-code\\b.txt", true));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();

    }
}
