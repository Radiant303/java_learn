package com.itheima.demo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("小王", 18, "男");
        Student s2 = new Student("李四", 20, "男");
        Student s3 = new Student("张吧", 12, "男");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int max = StudentUtil.getMaxAge(list);
        System.out.println(max);
    }
}
