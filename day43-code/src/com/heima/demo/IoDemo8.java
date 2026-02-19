package com.heima.demo;

import java.io.FileWriter;
import java.io.IOException;

public class IoDemo8 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day43-code\\a.txt");
        fw.write("你好田田");
        fw.close();
    }
}
