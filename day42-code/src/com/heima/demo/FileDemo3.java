package com.heima.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        //1.创建a.txt父级组件
        File file = new File("day42-code\\aaa");
        file.mkdirs();
        //2.创建a.txt
        File file1 = new File(file,"a.txt");
        boolean newFile = file1.createNewFile();
        System.out.println(newFile);
    }
}
