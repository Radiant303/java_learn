package com.itheima.demo3;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //静态初始化数组
        int[] arr = {10,20,30,40,50};

        //完整写法
        String[] arr2 = new String[]{"zhangsan","lisi","wangwu"};

        Double[] arr3 = {1.93,2.01,3.01};
        System.out.println(arr3);

        //[表示数组,
        // Ljava.lang.String;
        // 表示String类型,@表示对象
        //剩下表示地址值

        arr3[1] = 2.93;
        System.out.println(arr3[1]);

        //遍历数组
        for (Double aDouble : arr3) {
            System.out.println("-------" + aDouble);
        }

    }
}
