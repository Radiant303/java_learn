package com.itheima.api3;

public interface Inner {
    public abstract void method();
    public default void show() {
        System.out.println("Inner show");
    }
}
