package com.itheima.test4;

public class Student {
    private int age;
    private String name;
    public Student() {
        System.out.println("无参构造方法");
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("有参构造方法");
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void show() {
        System.out.println(name + "正在吃东西");
    }
    public void eat() {
        System.out.println(name + "正在吃东西");
    }
}
