package com.heima.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("wangwu",28);
        Student s3 = new Student("lisi",19);
        map.put(s1,"江苏");
        map.put(s2,"上海");
        map.put(s3,"北京");

        Set<Student> keys = map.keySet();
        for (Student key : keys) {
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("------------------");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("------------------");
        map.forEach((key,value)-> System.out.println(key + "=" + value));



    }
}
