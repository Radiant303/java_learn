package com.heima.demo2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends  Thread{
    ArrayList<Integer> list;
    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while ( true){
            synchronized (MyThread.class){
                if(list.size() == 0){
                    System.out.println(getName()+"没有数据了");
                    break;
                }else {
                    Collections.shuffle(list);
                    System.out.println(getName()+"取出了"+list.remove(0));
                }
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
