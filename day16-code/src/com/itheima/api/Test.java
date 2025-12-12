package com.itheima.api;

public class Test {

    public static void main(String[] args) {
        Frog f = new Frog("小青",2);
        System.out.println(f.getName()+" "+f.getAge());
        f.swim();
        f.eat();

        Rabbit r = new Rabbit("小白",4);
        System.out.println(r.getName()+" "+r.getAge());
        r.eat();

        Dog d = new Dog("大黄",20);
        System.out.println(d.getName()+" "+d.getAge());
        d.swim();
        d.eat();
    }
}
