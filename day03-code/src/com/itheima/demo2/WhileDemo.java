package com.itheima.demo2;

public class WhileDemo {
    public static void main(String[] args) {
        int a = 102;
        int b = 10;

        int count = 0;
        while(a>=b){
            if (a==92){
                a-=b;
                System.out.println("a="+a);
                continue;
            }
            a-=b;
            count++;
            break;
        }
        System.out.println(a);
        System.out.println(count);

    }
}
