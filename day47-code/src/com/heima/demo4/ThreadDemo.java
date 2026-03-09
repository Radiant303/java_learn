package com.heima.demo4;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        //mt1.setDaemon(true);
        mt.start();
        mt.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程-----------"+i);
        }
    }
}
