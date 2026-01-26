package com.heima.pukepai;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //准备牌
    //静态代码块:随着类的加载而加载且只执行一次
    static ArrayList<String> list = new ArrayList<>();
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
        list.add("小王");
        list.add("大王");
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
}
