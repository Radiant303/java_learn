package com.itheima.demo3;

public class Employee {
    private String id;
    private int age;
    private double salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String id, int age, double salary) {
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public void work(){
        System.out.println("员工正在工作");
    }

    public void eat(){
        System.out.println("正在吃米饭");
    }
}
