package com.heima.demo2;

import java.util.ArrayList;

public class FanXingDemo2 {
    public static void main(String[] args) {
        ArrayList<Dog> list = new ArrayList<>();
        ArrayList<Cat> list2 = new ArrayList<>();
        ArrayList<persiantCat> list3 = new ArrayList<>();
        keptCat(list3);
        keptCat(list2);
        keptCat(list);
    }
    public static void keptCat(ArrayList<? extends  Cat> e){
        System.out.println(e);
    }
}
abstract class Animal{
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();

    public String toString() {
        return "Animal{name = " + name + ", age = " + age + "}";
    }
}

abstract class Dog extends Animal{
}

abstract class Cat extends Animal{
}

class persiantCat extends Cat{
    @Override
    public void eat() {

    }
}

class liHuaCat extends Cat{
    @Override
    public void eat() {

    }
}