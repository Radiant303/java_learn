package com.itheima.api4;

public interface InnerA {
    public default void show1() {
        System.out.println("InnerA show1");
    }
    public default void show2() {
        System.out.println("InnerA show2");
    }
    //默认方法为默认方法服务
    public default void show3() {
        System.out.println("InnerA show3");
    }
    //静态方法为静态方法服务
    public static void show4() {
        System.out.println("InnerA show4");
    }
}
