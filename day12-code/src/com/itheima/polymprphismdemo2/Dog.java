package com.itheima.polymprphismdemo2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁"+getColor() +"狗吃" + something);
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
