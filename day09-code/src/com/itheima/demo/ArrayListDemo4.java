package com.itheima.demo;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("小王", 18, 1);
        Student s2 = new Student("小张", 19, 1);
        list.add(s1);
        list.add(s2);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge() + "," + s.getGender());
        }
    }
}
