package com.heima.demo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.setName("线程1");
        Thread t2 = new Thread(ft);
        t2.setName("线程2");
        t1.start();
        System.out.println(ft.get());

    }
}
