package com.itheima.demo4;

public class FangFaDemo6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] copy =capyOfRange(arr,2,5);

        for (int j : copy) {
            System.out.println(j);
        }
    }

    public static int[] capyOfRange(int[] arr,int from ,int to) {
        int[] newArr = new int[to-from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
