package com.heima.demo;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D"};
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i< 80; i++){
            int index = random.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String,Integer> map = new HashMap<>();
        for (String s : list) {
            if(map.containsKey(s)){
                Integer value = map.get(s);
                map.put(s,value+1);
            }else{
                map.put(s,1);
            }
        }
        System.out.println(map);

        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() > max){
                max = entry.getValue();
            }
        }
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() == max){
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
    }
}
