package com.itheima.demo1;

public class DuanLuYunSuanFu {
    public static void main(String[] args) {
        //短路逻辑运算符
        //1. && 逻辑与
        //两边都为true才为true
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        //2. || 逻辑或
        //两边都为false才为false
        System.out.println(true || true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);

        //当左边能够确定结果时，右边不再计算
    }
}
