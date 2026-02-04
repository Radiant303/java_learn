package com.heima.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionDemo8 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三,24"));
        list.add(new Student("张三丰,23"));
        list.add(new Student("张无忌,34"));
        list.add(new Student("问天,33"));
        String[] array = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println("Arrays.toString( array) = " + Arrays.toString(array));
    }
}
