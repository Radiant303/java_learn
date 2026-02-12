package com.heima.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\a.txt");
        boolean b = f1.createNewFile();
        //如果当前路径表示的文件不存在，则创建文件并返回true
        //如果当前路径表示的文件已经存在，则返回false
        System.out.println(b);

        boolean delete = f1.delete();
        System.out.println(delete);
    }
}
