package com.heima.demo6;

public class ThreaDemo {
    public static void main(String[] args) {
        MyThread mr = new MyThread();
        Thread t1 = new Thread(mr);
        t1.setName("线程1");
        Thread t2 = new Thread(mr);
        t2.setName("线程2");
        Thread t3 = new Thread(mr);
        t3.setName("线程3");
        t1.start();
        t2.start();
        t3.start();

    }
}
