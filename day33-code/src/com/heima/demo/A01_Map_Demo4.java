package com.heima.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class A01_Map_Demo4 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("张三","李四");
        map.put("王五","赵六");
        map.put("张八","张三");
        map.put("钱七","张三");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + "=" + s2);
            }
        });

        map.forEach((key,value)->System.out.println(key + "=" + value));
    }
}
