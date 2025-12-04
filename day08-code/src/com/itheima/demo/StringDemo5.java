package com.itheima.demo;

public class StringDemo5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(printArray(arr));
    }
    public static String printArray(int[] arr){
        if(arr==null){
            return "";
        }
        if(arr.length==0){
             return "[]";
        }
        String result = "[";

        for (int i = 0; i < arr.length; i++) {
           if(i==arr.length-1){
               result += arr[i];
           }else {
               result += arr[i] + ",";
           }
        }
        return result + "]";
    }
}
