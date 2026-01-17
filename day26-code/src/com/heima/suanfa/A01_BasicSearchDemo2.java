package com.heima.suanfa;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {56, 32, 31, 43, 11, 1, 65, 87, 24, 12};
        System.out.println(basicSearch(arr, 12));
    }

    public static int basicSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
