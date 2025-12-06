package com.itheima.demo3;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("zhangsan", 18, 5000, 5000);
        System.out.println(m.getId() + ',' + m.getAge() + ',' + m.getSalary() + ',' + m.getBouns());
        m.work();
        m.eat();

        Cook c = new Cook("lisi", 19, 5000);
        System.out.println(c.getId() + ',' + c.getAge() + ',' + c.getSalary());
        c.work();
        c.eat();

        Employee e = new Employee("wangwu", 20, 5000);
        System.out.println(e.getId() + ',' + e.getAge() + ',' + e.getSalary());
        e.work();
        e.eat();
    }
}
