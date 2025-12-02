package com.itheima.demo5;

import java.util.Scanner;

public class TestDemo4 {
    public static void main(String[] args) {

        int[] a = getScore();
        int max = getMax(a);
        int min = getMin(a);

    }
    public static int[] getScore(){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter number:"+(i+1));
            int score = sc.nextInt();
            if (score > 0 && score <= 100){
                a[i] = score;
            }else {
               System.out.println("请输入正确的数字");
            }
        }
        return a;
    }
    public static int getMax(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max="+max);
        return max;
    }
    public static int getMin(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("min="+min);
        return min;
    }
}
