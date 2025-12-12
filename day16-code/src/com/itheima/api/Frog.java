package com.itheima.api;

public class Frog extends Animal implements Swim{
    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }
    @Override
    public void eat() {
        System.out.println("小青蛙吃");
    }
    @Override
    public void swim() {
        System.out.println("小青蛙可以游");
    }
}
