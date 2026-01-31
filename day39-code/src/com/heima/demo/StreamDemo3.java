package com.heima.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //单列集合获取Stream 流
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        Stream<String> stream1 = list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.startsWith("张");
            }
        });
        stream1.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 3;
            }
        }).forEach(System.out::println);

        stream1.filter(s -> s.startsWith("张"));

    }
}
