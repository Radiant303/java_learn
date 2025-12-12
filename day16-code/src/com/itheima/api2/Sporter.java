package com.itheima.api2;

public abstract class Sporter extends Person{
    public Sporter(String name, int age) {
        super(name, age);
    }

    public Sporter() {
    }

    public abstract void study();
}
