package com.heima.demo;

import java.util.ArrayList;
import java.util.List;

public class CollectionListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add(2,"java");

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list2.remove(0));
        System.out.println(list2.remove(Integer.valueOf(1)));

        System.out.println(list.get(0));
        System.out.println(list.toArray().length);


        String s = list.set(0, "java");
        System.out.println(s);
        System.out.println(list);

        //get
        String s1 = list.get(0);
        System.out.println(s1);

    }
}
