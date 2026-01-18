package com.heima.demo;

public class FibonacciRabbitProblem {
    public static void main(String[] args) {
        int[] a = new int[12];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            a[i] = fib(i+1);
        }
        System.out.println(a[a.length - 1]);
    }

    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
