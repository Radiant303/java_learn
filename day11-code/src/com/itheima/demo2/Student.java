package com.itheima.demo2;

public class Student extends Person {
    public Student() {
        this(null);
    }
    public Student(String name) {
        super();
    }
    @Override
    public void show(){
        System.out.println("show()方法2");
    }
    public void show(Person p){
        System.out.println(p.name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        Person p = new Person();
        s.show(p);
    }
}
