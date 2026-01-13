package com.itheima.demo;

import java.util.Objects;

public class EqualsTest {
    public static void main(String[] args) {

        String s1 = new String("hello");
        StringBuilder s2 = new StringBuilder("hello");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2.toString()));
        System.out.println(s2.equals(s1));

        boolean result = Objects.equals(s1, s2);

    }
}