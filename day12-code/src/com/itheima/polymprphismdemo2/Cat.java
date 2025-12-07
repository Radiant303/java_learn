package com.itheima.polymprphismdemo2;

public class Cat extends Animal {
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁"+getColor() +"猫吃" + something);
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
