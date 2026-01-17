package com.heima.Object1;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LiveDays {
    public static void main(String[] args) throws ParseException {
//        String birthday = "2005年6月1日";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
//        long date = sdf.parse( birthday).getTime();
//        long currentTime = System.currentTimeMillis();
//        long liveDays = (currentTime - date) / 1000 / 60 / 60 / 24;
//        System.out.println(liveDays);

        String birthday = "2005-06-01";
        LocalDate birthday1 = LocalDate.parse(birthday);
        LocalDate now = LocalDate.now();
        long liveYears = ChronoUnit.YEARS.between(birthday1, now);
        System.out.println(liveYears);

    }
}
