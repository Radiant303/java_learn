package com.heima.demo2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10,5,30,50,100,300,100);

        MyThread t1 = new MyThread(list);
        MyThread t2 = new MyThread(list);
        MyThread t3 = new MyThread(list);

        t1.start();
        t2.start();
        t3.start();

    }
}
