package com.heima.suanfa;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {56, 32, 31, 43, 11, 1, 65, 87, 24, 12};

        System.out.println(basicSearch(arr, 112));
    }

    public static boolean basicSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
