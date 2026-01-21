package com.heima.demo;

import java.util.TreeSet;

/**
 * @author wz
 */
public class A02_TreeSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 13);
        Student s3 = new Student("wangwu", 45);

        TreeSet<Student> s = new TreeSet<>();
        s.add(s1);
        s.add(s2);
        s.add(s3);

        System.out.println(s);
    }
}
