package com.heima.demo1;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c);

        Date d = new Date() ;
        c.setTime(d);
        c.get(1);
        System.out.println(c.get(1));
        System.out.println(c.get(2));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
    }
}
