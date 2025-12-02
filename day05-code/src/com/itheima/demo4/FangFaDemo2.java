package com.itheima.demo4;

public class FangFaDemo2 {
    public static void main(String[] args) {
        sum(10,20,30);
    }
    //方法的重载
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}
