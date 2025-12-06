package com.itheima.polymprphismdemo1;

public class Test {
    String name;
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("小王");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("张老师");
        t.setAge(30);

        Administrator a = new Administrator();
        a.setName("李主管");
        a.setAge(28);

        register(s);
        register(t);
        register(a);
    }

    public static void register(Person p){
        p.show();
    }
}
