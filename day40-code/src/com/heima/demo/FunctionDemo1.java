package com.heima.demo;

import java.util.Arrays;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5};
        Arrays.sort(a,FunctionDemo1::func);

    }
    public static int func(int a , int b ){
        return a - b;
    }
}
