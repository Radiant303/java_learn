package com.heima.demo;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * @author wz
 */
public class A02_TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(1);
        s.add(5);
        s.add(3);
        s.add(2);
        s.add(4);

        System.out.println("s = " + s);

        Iterator<Integer> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        s.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("integer = " + integer);
            }
        });

        s.forEach(integer -> System.out.println("integer = " + integer));

        for (Integer i : s) {
            System.out.println("i = " + i);
        }
    }
}
