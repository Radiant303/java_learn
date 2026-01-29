package com.heima.demo1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author hanbing
 */
public class ImutableDemo1 {
    public static void main(String[] args) {
        List<String> hello = List.of("hello", "world");
        Iterator<String> iterator = hello.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println(hello);
        Set<Integer> integers = Set.of(1, 2, 3);
        System.out.println(integers);
        for (Integer next : integers) {
            System.out.println(next);
        }
    }
}
