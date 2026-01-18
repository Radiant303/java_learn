package com.heima.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();

        c.add("hello");
        c.add("world");
        System.out.println(c);

        c.clear();
        System.out.println(c);
        System.out.println(c.isEmpty());

        c.add("hello");
        c.add("world");

        boolean b =c.remove("hello");
        System.out.println(c);

        boolean result = c.contains("world");  //注意自定义对象需要重写equals方法
        System.out.println(result);

        int size = c.size();
        System.out.println(size);

        //isempty();
        System.out.println(c.isEmpty());
    }
}
