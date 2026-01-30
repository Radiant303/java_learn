package com.heima.demo1;

import java.util.*;

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

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("张三", "张三");
        map1.put("王五", "王五");
        System.out.println(map1);

        Map<String, String> stringStringMap = Map.copyOf(map1);
        System.out.println(stringStringMap);

        Map<Object, Object> objectObjectMap = Map.ofEntries(map1.entrySet().toArray(new Map.Entry[0]));
        System.out.println(objectObjectMap);

    }
}
