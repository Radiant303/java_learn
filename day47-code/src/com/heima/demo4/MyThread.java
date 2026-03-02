package com.heima.demo4;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName());
        System.out.println("线程启动了");
    }
}
