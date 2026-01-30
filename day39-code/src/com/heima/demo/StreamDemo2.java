package com.heima.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //单列集合获取Stream 流
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

        //多列集合获取Stream 流
        HashMap<String, String> map = new HashMap<>();
        map.put("001", "张无忌");
        map.put("002", "周芷若");
        map.put("003", "赵敏");
        map.put("004", "张强");
        map.put("005", "张三丰");
        map.keySet().stream().forEach(System.out::println);
        map.entrySet().stream().forEach(System.out::println);

        //数组获取Stream 流
        String[] names = {"张无忌", "周芷若", "赵敏", "张强", "张三丰"};

        Arrays.stream(names).forEach(System.out::println);

        Stream.of(10, 20, 30, 40, 50).forEach(System.out::println);
    }
}
