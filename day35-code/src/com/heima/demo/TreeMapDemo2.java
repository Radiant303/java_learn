package com.heima.demo;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> treeMap = new TreeMap<>();
        treeMap.put(new Student("zhangsan", 18), "江苏");
        treeMap.put(new Student("lisi", 22), "浙江");
        treeMap.put(new Student("wangwu", 43), "北京");
        treeMap.put(new Student("zhaoliu", 11), "江西");

        System.out.println(treeMap);
    }
}
