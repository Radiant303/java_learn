package com.heima.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("day46-code\\names.txt"));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
