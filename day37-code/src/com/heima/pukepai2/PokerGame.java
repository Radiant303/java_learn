package com.heima.pukepai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static HashMap<Integer,String> pokerMap = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();
    static {
        //创建一个数组保存54张牌
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {
                "3", "4", "5", "6", "7",
                "8", "9", "10", "J",
                "Q", "K", "A", "2"
        };

        int serialNumber = 1;
        for (String number : numbers) {
            for (String color : colors) {
                pokerMap.put(serialNumber,color+number);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        pokerMap.put(serialNumber,"小王");
        list.add(serialNumber);
        pokerMap.put(serialNumber+1,"大王");
        list.add(serialNumber+1);
        System.out.println(pokerMap);
        System.out.println(list);
    }
    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        
        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player01 = new TreeSet<>();
        TreeSet<Integer> player02 = new TreeSet<>();
        TreeSet<Integer> player03 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            int i1 = list.get(i);
            if (i<=2){
                lord.add(i1);
                continue;
            }
            if (i%3==0){
                player01.add(i1);
            } else if (i%3 == 1) {
               player02.add(i1);
            }else {
                player03.add(i1);
            }
        }
        lookPoker("底牌",lord);
        lookPoker("玩家1",player01);
        lookPoker("玩家2",player02);
        lookPoker("玩家3",player03);
    }
    public  void lookPoker(String name, TreeSet<Integer> list){
        System.out.print(name+"的牌是：");
        for (int i : list) {
            System.out.print(pokerMap.get(i)+" ");
        }
        System.out.println();
    }
}