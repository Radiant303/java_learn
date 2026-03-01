package com.heima.demo2;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRunable mr = new MyRunable();
        Thread t1 = new Thread(mr);
        t1.setName("线程1");
        Thread t2 = new Thread(mr);
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
