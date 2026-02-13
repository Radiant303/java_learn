package com.heima.demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo {
    public static void main(String[] args) throws IOException {
        //1.创建一个输出流对象
        FileOutputStream fos = new FileOutputStream("day43-code\\a.txt");
        fos.write(97);
        fos.write(98);
        fos.close();

    }
}
