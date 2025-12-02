package com.itheima.demo4;

public class FangFaDemo4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};

        //调用方法求最大值
        int max = getMax(a);
        System.out.println(max);
    }
    //求最大值
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
