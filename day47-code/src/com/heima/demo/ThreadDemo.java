package com.heima.demo;

public class ThreadDemo {
    public static void main(String[] args) {
        //多线程的第一种实现方式
        //重写run方法
        //创建线程对象
        MyThread mt = new MyThread();
        mt.setName("线程1");
        MyThread mt2 = new MyThread();
        mt2.setName("线程2");
        mt.start();
        mt2.start();
    }
}
