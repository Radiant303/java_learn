package com.heima.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        System.out.println(d.getTime());

        Date d2 = new Date();
        System.out.println(d2.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EE");
        String format = sdf.format(d);
        System.out.println(format);


        String s = "2020-09-08 09:09:09 星期一";
        Date parse = sdf.parse(s);
        System.out.println(parse);

    }
}
