package com.heima.demo;

import java.util.Arrays;

public class A02_BubbleDemo2 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
