package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        Husky hk = new Husky();
        hk.eat();
        hk.drink();
        hk.lookHome();
        hk.breakHome();
    }
}
