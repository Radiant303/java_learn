package com.heima.demo6;

public class MyThread implements Runnable {
    int ticket = 0;
    @Override
    public void run() {
        while (true) {
            if (extracted()) break;
        }
    }

    private boolean extracted() {
        synchronized (MyThread.class) {
            if (ticket == 100) {
                return true;
            }else {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket++;
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            }
        }
        return false;
    }
}
