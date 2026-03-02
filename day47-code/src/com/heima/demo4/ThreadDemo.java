package com.heima.demo4;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyThread mt1 = new MyThread();
        mt1.setDaemon(true);
        mt.start();
    }
}
