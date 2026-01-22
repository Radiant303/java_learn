package com.heima.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * Map集合的遍历方式
 */
public class A01_Map_Demo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("张三","李四");
        map.put("王五","赵六");
        map.put("张八","张三");
        map.put("张三","张三");

        String result = map.remove("张三");

        System.out.println("result = " + result);

        map.clear();

        System.out.println(map.isEmpty()+""+map.size());

        System.out.println("map = " + map);
    }
}
