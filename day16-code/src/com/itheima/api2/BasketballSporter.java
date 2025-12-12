package com.itheima.api2;

public class BasketballSporter extends Sporter{
    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    public BasketballSporter() {
    }

    @Override
    public void study() {
        System.out.println("Basketball Sporter study");
    }
}
