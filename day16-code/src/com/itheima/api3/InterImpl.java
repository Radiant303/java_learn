package com.itheima.api3;

public class InterImpl implements  Inner, Inner2{
    public InterImpl() {
    }

    public void method() {
        System.out.println("Inner接口的实现类");
    }

    @Override
    public void show() {
        System.out.println("Inner show2");
    }
}
