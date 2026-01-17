package com.heima.demo;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayDemo {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr));

        //二分查找  有序且升序
        int index = Arrays.binarySearch(arr, 3);

        //拷贝数组三种情况
        //新数组的长度小于原数组,部分拷贝
        //新数组的长度等于原数组,完全拷贝
        //新数组的长度大于原数组,剩余部分用0填充
        Integer[] arr1 = Arrays.copyOf(arr, 2);
        System.out.println(Arrays.toString(arr1));

        //指定范围拷贝,前开,后闭
        Integer[] arr2 = Arrays.copyOfRange(arr, 1, 3);

        //填充数组
        //用指定数字填充覆盖数组
        //Arrays.fill(arr, 5);

        //sort 排序 底层使用快速排序 默认升序
        Arrays.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("=================");
                System.out.println("o1:"+o1);
                System.out.println("o2:"+o2);
                return o2-o1;
            }

        });

        System.out.println(Arrays.toString(arr));
    }
}
