package com.itheima.demo3;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //需求：定义一个数组，求数组中的最大值
        int[] arr = {20,33,12,30,91,82};
        int max = arr[0];//max初始化的值为数组的第一个元素
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
