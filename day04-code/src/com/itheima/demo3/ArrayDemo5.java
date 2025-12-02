package com.itheima.demo3;

import java.util.Random;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] arr =new int [10];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+1;
        }
        for (int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
        int avg = sum/arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<avg){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
    }
}
