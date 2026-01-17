package com.heima.demo;

public class A03_InsertDemo {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
    }
    public static void insertSort(int[] arr){
        //找到无序数组从那开始
        int startIndex = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                startIndex = i+1;
                break;
            }
        }
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
