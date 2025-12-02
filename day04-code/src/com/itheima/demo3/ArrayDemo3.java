package com.itheima.demo3;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //动态初始化
        //创建一个长度为10的数组
        String[] arr = new String[10];

        arr[0] = "zhangsan";

        System.out.println(arr[0]);


        //数组默认初始化规律
        //整数类型：0
        //浮点类型：0.0
        //字符类型：\u0000 空格
        //布尔类型：false
        //引用类型：null
    }
}
