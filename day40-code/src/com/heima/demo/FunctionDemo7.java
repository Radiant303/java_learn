package com.heima.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,24", "张三丰,23", "张无忌,34", "问天,33", "鳖昭,15");
        Student[] array = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println("Arrays.toString( array) = " + Arrays.toString(array));
    }
}
