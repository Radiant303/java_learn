package com.itheima.api;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name,age);
    }

    @Override
    public void eat() {

    }

    @Override
    public void swim() {
        System.out.println("Dog can swim");
    }
}
