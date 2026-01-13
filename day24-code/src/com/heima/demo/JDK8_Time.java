package com.heima.demo;

import java.time.ZoneId;
import java.util.Set;

public class JDK8_Time {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取指定时区
        ZoneId zoneId1 = ZoneId.of("Asia/Taipei");
        System.out.println(zoneId1);
    }
}
