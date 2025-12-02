package com.itheima.test1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        p.brand = "华为";
        p.price = 50;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playGame();
    }
}
