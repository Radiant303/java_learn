package com.itheima.api;

public class Rabbit extends Animal {
    public Rabbit(String name, int age) {
        super(name, age);
    }

    public Rabbit() {
    }
    @Override
    public void eat() {
        System.out.println("Rabbit eat");
    }
}
