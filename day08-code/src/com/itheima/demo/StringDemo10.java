package com.itheima.demo;

public class StringDemo10 {
    public static void main(String[] args) {
        String talk = "大笨蛋,你玩的真好,以后不要再玩了";

        String[] arr = {"笨蛋","傻瓜","白痴"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replaceAll(arr[i],"***");
        }
        System.out.println(talk);
    }

    
}
