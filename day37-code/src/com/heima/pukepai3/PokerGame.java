package com.heima.pukepai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    //准备牌
    //静态代码块:随着类的加载而加载且只执行一次
    static ArrayList<String> list = new ArrayList<>();
    static HashMap<String,Integer> pokerMap = new HashMap<>();
    static {
        //创建一个数组保存54张牌
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {
                "3", "4", "5", "6", "7",
                "8", "9", "10", "J",
                "Q", "K", "A", "2"
        };

        for (String color : colors) {
            for (String number : numbers) {
                list.add(color + number);
            }
        }
        list.add(" 小王");
        list.add(" 大王");

        //指定牌的价值
        pokerMap.put("J",11);
        pokerMap.put("Q",12);
        pokerMap.put("K",13);
        pokerMap.put("A",14);
        pokerMap.put("2",15);
        pokerMap.put("小王",50);
        pokerMap.put("大王",100);
    }
    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        System.out.println(list);
        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i<=2){
                lord.add(poker);
                continue;
            }
            if (i%3==0){
                player01.add(poker);
            }else if (i%3==1){
                player02.add(poker);
            }else {
                player03.add(poker);
            }
        }



        //排序
        order(lord);
        order(player01);
        order(player02);
        order(player03);

        //看牌
        lookPoker("底牌",lord);
        lookPoker("玩家1",player01);
        lookPoker("玩家2",player02);
        lookPoker("玩家3",player03);
    }
    public  void lookPoker(String name, ArrayList<String> list){
        System.out.print(name+"的牌是：");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
    //利用牌的价值排序
    public void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                int i = value1 - value2;
                if (i==0){
                    i = color1.compareTo(color2);
                }
                return i;
            }
        });
    }
    public int getValue(String poker){
       String number = poker.substring(1);
       if (pokerMap.containsKey( number)){
           return pokerMap.get(number);
       }else {
           return Integer.parseInt(number);
       }
    }
}
