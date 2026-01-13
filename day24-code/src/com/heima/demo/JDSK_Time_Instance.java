package com.heima.demo;

import java.time.Instant; //时间类 时间戳  类
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JDSK_Time_Instance {
    public static void main(String[] args) {
        //获取当前时间
        Instant time = Instant.now();
        System.out.println(time);
        
        //根据(秒/毫秒/纳秒)获取Instant对象
        Instant time1 = Instant.ofEpochSecond(5);
        System.out.println(time1);
        
        Instant time2 = Instant.ofEpochMilli(5);
        System.out.println(time2);
        
        Instant time3 = Instant.ofEpochSecond(5,1000000000);
        System.out.println(time3);

        //指定时区
        ZonedDateTime time4 = Instant.ofEpochSecond(5).atZone(ZoneId.of("Asia/Taipei"));
        System.out.println(time4);

        //判断时间在之前
        boolean before = time.isBefore(time1);
        System.out.println(before);

        //减少时间
        Instant time5 = time.minusSeconds(5);
        System.out.println(time5);

        //增加时间
        Instant time6 = time.plusSeconds(5);
        System.out.println(time6);


    }
}
