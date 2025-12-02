package com.itheima.demo4;

public class FangFaDemo5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        //调用数字是否在数组中判断方法
    }
    //数字是否在数组中判断方法
    public static boolean isInArray(int[] a,int number){
        for (int i = 0; i < a.length; i++) {
            if (a[i]==number){
                return true;
            }
        }
        return false;
    }
}
