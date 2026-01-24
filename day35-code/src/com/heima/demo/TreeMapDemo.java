package com.heima.demo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        treeMap.put(1, "张三");
        treeMap.put(2, "王五");
        treeMap.put(5, "张三");
        treeMap.put(4, "王五");

        System.out.println("treeMap = " + treeMap);
    }
}
