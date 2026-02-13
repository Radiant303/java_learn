package com.heima.demo;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {
    public static void main(String[] args) {
        File[] arr = File.listRoots();
        for (File file : arr) {
            System.out.println(file);
        }

        File f1 = new File("D:\\Downloads");
        String[] arr1 = f1.list((dir, name) -> name.endsWith(".txt"));
        for (String file : arr1) {
            System.out.println(file);
        }

        //filename filter
        File f2 = new File("D:\\Downloads");
        String[] arr2 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
    }
}
