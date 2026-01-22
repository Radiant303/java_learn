package com.heima.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wz
 */
public class A01_Map_Demo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("张三","张三");
        map.put("李四","张五");
        map.put("王五","赵六");
        map.put("钱七","歌德");

        map.forEach((k,v)-> System.out.println(k + "=" + v));

        Set<String> keys = map.keySet();

        for (String k : keys) {
            System.out.println(k + "=" + map.get(k));
        }

        System.out.println("------------------");
        for (String k : map.keySet()){
            System.out.println(k + "=" + map.get(k));
        }
    }
}
