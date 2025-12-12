package com.itheima.demo1;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.carName = "法拉利";
        Car.Engine e = c.new Engine();
        e.engineName = "V8";
        e.run();
    }
}
