package com.itheima.demo3;

public class Cook extends Employee{
    public Cook(String id, int age, double salary) {
        super(id, age, salary);
    }

    public Cook() {
    }

    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }
}
