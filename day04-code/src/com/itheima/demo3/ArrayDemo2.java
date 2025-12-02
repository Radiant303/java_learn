package com.itheima.demo3;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //需求：求数组中所有元素的和
        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        //统计偶数个数
        int count1 = 0;
        for (int i= 0;i<arr.length;i++){
            if (arr[i]%2==0){
                count1++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("-----"+count1);
    }
}
