package com.heima.demo;

import java.io.FileReader;
import java.io.IOException;

public class IoDemo7 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day43-code\\a.txt");
        char[] chs = new char[2];
        int len;
        while ((len = fr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }
    }
}
