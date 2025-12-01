package com.itheima.demo1;

import java.util.Scanner;

public class ZiFuChuanXiangJia {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("个位是:"+num%10);
        System.out.println("十位是:"+num/10%10);
        System.out.println("百位是:"+num/100%10);
    }
}
