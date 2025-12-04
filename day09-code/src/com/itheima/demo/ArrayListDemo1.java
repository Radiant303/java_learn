package com.itheima.demo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //泛型: 集合类中存储的数据的类型
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("c");
        System.out.println(list.size());
        System.out.println(list);

        //删除
        Boolean remove = list.remove("hello");
        System.out.println(remove);
        System.out.println(list);

        //索引删除
        String remove1 = list.remove(0);
        System.out.println(remove1);
        System.out.println(list);

        //修改
        list.set(0,"golang");
        System.out.println(list);

        //查询
        String s = list.get(0);
        System.out.println(s);

        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}
