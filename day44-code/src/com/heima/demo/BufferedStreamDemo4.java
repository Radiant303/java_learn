package com.heima.demo;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
/*        InputStreamReader isr = new InputStreamReader(new FileInputStream("day44-code\\a.txt"),"utf-8");
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }
        try {
            isr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        FileReader fr = new FileReader("day44-code\\a.txt", Charset.forName("utf-8"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        try {
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
