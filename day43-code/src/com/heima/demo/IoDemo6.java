package com.heima.demo;

import java.io.FileReader;
import java.io.IOException;

public class IoDemo6 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day43-code\\a.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println(ch);
        }
        fr.close();
    }
}
