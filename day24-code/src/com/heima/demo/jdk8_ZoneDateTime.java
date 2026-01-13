package com.heima.demo;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class jdk8_ZoneDateTime {
    public static void main(String[] args) {
        //获取当前时间对象(带时区)
        ZonedDateTime time = ZonedDateTime.now();
        System.out.println(time);

        //获取指定时区时间对象
        ZonedDateTime time1 = ZonedDateTime.now(ZoneId.of("Asia/Taipei"));
        System.out.println(time1);

        //修改时间系列
        ZonedDateTime time2 = time.withHour(5);
        System.out.println(time2);

        //减少时间
        ZonedDateTime time3 = time.minusHours(5);
        System.out.println(time3);

        //增加时间
        ZonedDateTime time4 = time.plusHours(5);
        System.out.println(time4);



    }
}
