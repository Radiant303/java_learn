package com.heima.demo;

public class HouZiChiTao {
    public static void main(String[] args) {
        System.out.println(fib(1));
    }
    public static int fib(int n){
        if (n == 10) return 1;
        return (fib(n+1)+1)*2;
    }
}
