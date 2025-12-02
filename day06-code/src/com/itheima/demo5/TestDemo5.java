package com.itheima.demo5;

import static java.lang.System.out;

public class TestDemo5 {
    public static void main(String[] args) {
        //二维数组
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                out.print(a[i][j]+" ");
            }
            out.println();
        }

        //输出当前java版本
        out.println(System.getProperty("java.version"));
    }
}
