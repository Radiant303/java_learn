package com.itheima.demo4;

public class FangFaDemo3 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int[] b = new int[]{1,2,3,4,5,6};
        printArr(new int[]{1,2,3,4,5,6});
    }
    public static void printArr(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if(i==a.length-1){
                System.out.print(a[i]);
            }else {
                System.out.print(a[i]+",");
            }
        }
        System.out.println("]");
    }
}
