package com.heima.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("python");


        Iterator it = list.iterator();

        //while (it.hasNext()){
            //String s = (String) it.next();
            //System.out.println(s);
           // it.remove();//删除当前获取到的s
        //}
        System.out.println("===================");
        //获取新的迭代器对象才能拿到新的指针
        //for (String s : list){
         //   System.out.println(s);
        //}


        it.forEachRemaining(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });

        it.forEachRemaining(System.out::println);
    }
}
