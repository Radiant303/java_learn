package com.heima.demo1;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
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

        //Map
        Map<String, String> map = Map.of("张三", "张三", "王五", "王五");
        System.out.println(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
