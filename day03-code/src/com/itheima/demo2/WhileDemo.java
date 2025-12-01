package com.itheima.demo2;

import java.util.Random;
import java.util.Scanner;

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

        Random random = new Random();
        int number = random.nextInt(10)+1;
        Scanner sc = new Scanner(System.in);
        int count1 = sc.nextInt();
        while(number!=count1){
            System.out.println("请输入数字：");
            if (count1<number) {
                System.out.println("数字小了");
            } else if (count1>number) {
                System.out.println("数字大了");
            }else {
                System.out.println("恭喜你猜对了");
            }
            count1 = sc.nextInt();
        }

    }
}
