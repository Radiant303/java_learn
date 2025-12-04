package com.itheima.demo;

public class StringDemo12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String s = arrToString(arr);
        System.out.println(s);
    }
    public static String arrToString(int[] arr) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
