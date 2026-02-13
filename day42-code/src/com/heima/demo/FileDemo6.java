package com.heima.demo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileDemo6 {
    public static void main(String[] args) {
        File file = new File("D:\\Downloads");
        HashMap<String,Integer> map = getCount(file);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }

    }
    public static HashMap<String,Integer> getCount(File src){
        HashMap<String,Integer> map = new HashMap();

        File[] files = src.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                String name = f.getName();
                String[] arr = name.split("\\.");
                if (arr.length>=2){
                    String key = arr[arr.length - 1];
                    if (map.containsKey(key)){
                        map.compute(key, (k, value) -> value + 1);
                    }else {
                        map.put(key,1);
                    }
                }
            }
            else{
                HashMap<String,Integer> map1 = getCount(f);
                Set<Map.Entry<String, Integer>> entries = map1.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if (map.containsKey(key)){
                        map.compute(key, (k, v) -> v + value);
                    }else {
                        map.put(key,value);
                    }
                }
            }
        }
        return map;
    }
}
