package com.itheima.demo3;

public class Test {
    public static void main(String[] args) {

        new Swim(){
            @Override
            public void swim() {
                System.out.println("匿名内部类");
            }
        };
        show(new Swim() {
            @Override
            public void swim() {
                System.out.println("匿名内部类");
            }
        });
    }

    public static void show(Swim s){
        s.swim();
    }
}
