package com.heima.demo;

import java.io.*;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day44-code\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day44-code\\b.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        try {
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
