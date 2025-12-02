package com.itheima.demo3;

import java.util.Random;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
