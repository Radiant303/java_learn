package com.heima.demo3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MythreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool1 = Executors.newCachedThreadPool();

        pool1.submit(new MyRunable());

        pool1.shutdown();
    }
}
