package com.heima.demo;

import java.time.LocalDate;

public class RiLiLeiLocalDate {
    public static void main(String[] args) {
        //获取当前时间的LocalDate对象
        LocalDate date = LocalDate.now();

        //获取指定时间的LocalDate对象
        LocalDate date1 = LocalDate.of(2020, 5, 5);

        //get方法获取每一个属性值
        int year = date1.getYear();
        System.out.println(year);
        int month = date1.getMonthValue();
        System.out.println(month);
        int day = date1.getDayOfMonth();

        //is判断时间是否在某个时间之前/之后
        boolean before = date1.isBefore(date);
        System.out.println(before);
        boolean after = date1.isAfter(date);
        System.out.println(after);

        //with方法修改时间
        LocalDate date2 = date1.withYear(2021);
        System.out.println(date2);

        //plus方法增加时间
        LocalDate date3 = date1.plusDays(5);
        System.out.println(date3);

        //minus方法减少时间
        LocalDate date4 = date1.minusYears(5);
        System.out.println(date4);

        //判断时间是不是某天
        boolean leapYear = date1.isLeapYear();


    }
}
