package com.heima.demo;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File file = new File("D:\\Downloads");
        System.out.println(getLen(file)/1024.0/1024.0/1024.0);

    }
    public static long getLen(File src){
        long len = 0;

        File[] files = src.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                len += f.length();
            } else {
                len += getLen(f);
            }
        }
        return len;
    }

}
