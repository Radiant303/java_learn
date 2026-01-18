package com.heima.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        /*
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("===================");
        for (String s : list){
            System.out.println(s);
        }
        System.out.println("===================");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("===================");
        list.forEach(System.out::println);

        */

        //增强for
        for (String s : list){
            System.out.println(s);
        }
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String s = it.next();
            it.set(s+"1");
            System.out.println(s);
            System.out.println(list);
        }

    }
}
