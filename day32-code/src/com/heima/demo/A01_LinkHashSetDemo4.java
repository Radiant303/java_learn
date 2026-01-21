package com.heima.demo;

import java.util.LinkedHashSet;

/**
 * @author wz
 */
public class A01_LinkHashSetDemo4 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 13);
        Student s3 = new Student("wangwu", 45);
        Student s4 = new Student("shangguigu", 23);
        Student s5 = new Student("zhangsan", 34);

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        System.out.println(lhs.add(s5));

        System.out.println(lhs);
    }
}
