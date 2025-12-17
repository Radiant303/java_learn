package com.itheima.demo;

public class SystemTest {
    public static void main(String[] args) {
        //时间戳
        System.out.println(System.currentTimeMillis());
        System.out.println(1+1+ Math.random());
        System.out.println(System.currentTimeMillis());

        //拷贝数组
        int[] arr = {1,2,3,4,5};
        int[] arr1 = new int[arr.length+3];
        System.arraycopy(arr,0,arr1,4,3);
        for (int j : arr1) {
            System.out.println(j);
        }
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println(System.currentTimeMillis());

    }
}
