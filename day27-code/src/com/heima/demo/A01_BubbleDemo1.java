package com.heima.demo;

import java.util.Arrays;

public class A01_BubbleDemo1 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
