package com.itheima.demo5;

import java.util.Scanner;

public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int ticket = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入头等舱还是经济舱：");
        int seat = sc.nextInt();
        ticket = getTicket(month, seat, ticket);
        System.out.println("机票价格："+ticket);
    }

    private static int getTicket(int month, int seat, int ticket) {
        if (month >=5 && month <=10){
            //旺季
            if (seat ==1){
                ticket = (int) (ticket *0.9);
            }else if (seat ==0){
                ticket = (int) (ticket *0.8);
            }
        }else if( month >=11 && month <=12 ||(month >=1 && month <=4)){
            //淡季
            if (seat ==1){
                ticket = (int) (ticket *0.7);
            }else if (seat ==0){
                ticket = (int) (ticket *0.65);
            }
        }else {
            System.out.println("输入的月份有误");
            return 0;
        }
        return ticket;
    }


}
