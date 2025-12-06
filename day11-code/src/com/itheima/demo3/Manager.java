package com.itheima.demo3;

public class Manager extends Employee{
    private double bouns;

    public Manager(String id, int age, double salary, double bouns) {
        super(id, age, salary);
        this.bouns = bouns;
    }

    public Manager() {
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
