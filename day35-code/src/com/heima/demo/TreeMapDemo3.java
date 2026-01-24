package com.heima.demo;

import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        String s = "asdasfwafewsacssac";

        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (treeMap.containsKey(c)) {
                Integer count = treeMap.get(c);
                treeMap.put(c, count + 1);
            } else {
                treeMap.put(c, 1);
            }
        }
        /*System.out.println(treeMap);*/
        StringBuilder sb = new StringBuilder();
        treeMap.forEach((k, v) -> {
            sb.append(k).append("(").append(v).append(")");
        });
        System.out.println(sb);
    }
}
