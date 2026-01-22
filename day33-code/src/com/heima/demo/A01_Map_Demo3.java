package com.heima.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author wz
 */
public class A01_Map_Demo3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("张三","李四");
        map.put("王五","赵六");
        map.put("张八","张三");
        map.put("钱七","张三");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        //lambda
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
        map.entrySet().forEach(System.out::println);
    }
}
