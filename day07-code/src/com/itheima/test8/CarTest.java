package com.itheima.test8;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] car = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < car.length; i++) {
            Car car1 = new Car();
            System.out.println("请输入第"+(i+1)+"辆车的牌：");
            String brand = sc.next();
            car1.setBrand(brand);

            System.out.println("请输入第"+(i+1)+"辆车的价格：");
            String model = sc.next();
            car1.setPrice(Integer.parseInt(model));

            System.out.println("请输入第"+(i+1)+"辆车的颜色：");
            String color = sc.next();
            car1.setColor(color);

            car[i] = car1;
        }

        for (int i = 0; i < car.length; i++) {
            Car car1 = car[i];
            System.out.println(car1.getBrand()+","+car1.getPrice()+","+car1.getColor());
        }
    }
}
