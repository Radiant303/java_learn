package com.heima.demo;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "12322", "3", "4", "5");
        list.stream().filter(FunctionDemo3::startsWith5).forEach(System.out::println);
    }
    public static boolean startsWith5(String s) {
        return s.startsWith("1") && s.length() ==5;
    }
}
