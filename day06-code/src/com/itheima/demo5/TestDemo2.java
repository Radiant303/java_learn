package com.itheima.demo5;

public class TestDemo2 {
    public static void main(String[] args) {
        //判断质数
        int count = 0;
        for (int i = 0; i < 200; i++) {
            if (isPrime(i)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);

    }
    public static boolean isPrime(int i){
        boolean flag = true;
        for (int j = 2; j <i ; j++) {
            if(i % j == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
