package com.itheima.demo;

import java.io.IOException;

public class RunTest {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("总内存：" + runtime.totalMemory());
        System.out.println("空闲内存：" + runtime.freeMemory());
        System.out.println("最大内存：" + runtime.maxMemory());
        //线程
        System.out.println("线程数：" + runtime.availableProcessors());
        System.out.println("总内存：" + runtime.totalMemory() / 1024 / 1024);

        runtime.exec("shutdown -a");
    }
}
