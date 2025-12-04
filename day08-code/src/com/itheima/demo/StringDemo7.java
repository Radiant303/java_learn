package com.itheima.demo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true){
            System.out.println("请输入金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999){
                break;
            }else {
                System.out.println("输入金额有误，请重新输入：");
            }
        }
        String moneyStr = "";
        while (true){
            //从右向左获取数据
            int ge = money % 10;
            moneyStr = getCapitalNumber(ge) + moneyStr;
            money = money / 10;

            if(money == 0){
                break;
            }

        }

        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);

        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }

    public static String getCapitalNumber(int number) {
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
