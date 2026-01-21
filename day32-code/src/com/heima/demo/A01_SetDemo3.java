package com.heima.demo;

import java.util.HashSet;

/**
 * @author wz
 */
public class A01_SetDemo3 {
    public static void main(String[] args) {
        Student s1 = new Student("小王", 18);
        Student s2 = new Student("小王", 18);

        HashSet<Student> s = new HashSet<>();
        s.add(s1);
        s.add(s2);
        System.out.println(s);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

    }
}
