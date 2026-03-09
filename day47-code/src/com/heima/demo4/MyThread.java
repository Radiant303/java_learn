package com.heima.demo4;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"线程启动了");
            //Thread.yield();
        }

    }
}
