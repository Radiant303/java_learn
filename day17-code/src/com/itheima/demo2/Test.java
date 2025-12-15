package com.itheima.demo2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class Test {
    public static void main(String[] args) throws Throwable {
        //创建对象的方式
        //类名 对象名 = new 类名();
        Outer outer = new Outer();
        Object inner=outer.getInner();
        MethodHandles.Lookup lookup = MethodHandles.privateLookupIn(inner.getClass(), MethodHandles.lookup());
        MethodType methodType = MethodType.methodType(void.class);
        MethodHandle showMethodHandle = lookup.findVirtual(inner.getClass(), "show", methodType);
        showMethodHandle.invoke(inner);
    }
}
