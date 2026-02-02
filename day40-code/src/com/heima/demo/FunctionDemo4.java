package com.heima.demo;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,24", "张三丰,23", "张无忌,34", "问天,33", "鳖昭,15");

        list.stream().map(Student::new).forEach(System.out::println);
    }
}
