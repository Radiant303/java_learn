package com.itheima.demo2;

public class SwitchDemo {
    public static void main(String[] args) {
        switch(2){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("没有匹配的");
                break;
        }

        //case穿透
        switch(2){
            case 1,3,4,5:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            case 6:
                System.out.println("6");
                break;
            default:
                System.out.println("没有匹配的");
                break;
        }
        //简化版语句体(jdk12+)
        switch(2){
            case 1,3,4 -> System.out.println("1");
            case 2 -> System.out.println("2");
            default -> System.out.println("没有匹配的");
        }
    }

}
