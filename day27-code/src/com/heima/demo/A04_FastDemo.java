package com.heima.demo;

public class A04_FastDemo {
    public static void main(String[] args) {
        int[] arr = {6, 10, 5, 6, 2, 3, 1, 7, 8, 9, 4};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int [] arr, int left, int right){
        int start = left;
        int end = right;

        if(start >= end){
            return;
        }

        int baseNumber = arr[left];
        while(start !=  end){
            while(true){
                if(arr[end] < baseNumber || start>= end){
                    break;
                }
                end--;
            }
            while(true){
                if(arr[start] > baseNumber || start>= end){
                    break;
                }
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


        }
        int temp = arr[start];
        arr[start] = arr[left];
        arr[left] = temp;
        quickSort(arr, left, start - 1);
        quickSort(arr, start + 1, right);



    }
}
