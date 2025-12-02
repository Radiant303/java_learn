package com.itheima.demo4;

public class FangFaDemo1 {
    public static void main(String[] args) {
        //方法的调用
        //playGame();
        //playGame();
        int sum = sumNum(10,20);
        System.out.println(sum);
    }

    //方法定义
    public static void playGame() {
        System.out.println("开始游戏");
        System.out.println("选人物");
        System.out.println("打怪");
        System.out.println("结束游戏");
    }

    //求和
    public static int sumNum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }


}
