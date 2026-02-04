package com.heima.demo;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Integer[] array = list.stream().toArray(Integer[]::new);
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }
}
