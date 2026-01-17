package com.heima.suanfa;

public class A02_BinaryDemo1 {
    public static void main(String[] args) {
        int[] arr = {56, 32, 31, 43, 11, 1, 65, 87, 24, 12};
        int index = binarySearch(arr, 1);
        System.out.println(index);
    }
    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
