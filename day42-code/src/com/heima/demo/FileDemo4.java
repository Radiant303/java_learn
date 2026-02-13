package com.heima.demo;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        System.out.println(hasAVI(file));
    }

    public static boolean hasAVI(File file) {
        if (file.isFile()) {
            System.out.println(file);
            return file.getName().endsWith(".txt");
        }
        File[] files = file.listFiles();
        for (File f : files) {
            if (hasAVI(f)) {
                return true;
            }
        }
        return false;
    }
}
