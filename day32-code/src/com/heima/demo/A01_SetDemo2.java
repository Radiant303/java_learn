package com.heima.demo;
/**
 * @author wz
 * Set集合存储自定义对象
 */
public class A01_SetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("小王", 18);
        Student s2 = new Student("小王", 18);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
