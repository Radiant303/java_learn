package com.heima.Object1;

import java.time.LocalDate;
import java.time.Year;

public class RunYearPingYear {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入年份：");
//        int year = sc.nextInt();
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(year,2,1);
//        //减去一天
//        calendar.add(Calendar.DATE,-1);
//        int day = calendar.get(Calendar.DATE);
//        if(day == 29){
//            System.out.println(year+"是闰年");
//        }else {
//            System.out.println(year+"不是闰年");
//        }

        LocalDate ld = LocalDate.of(2020,3,1);
        ld = ld.minusDays(1);
        int day = ld.getDayOfMonth();
        if(day == 29){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
        System.out.println(ld.isLeapYear());

        boolean leapYear = Year.isLeap(2020);
        System.out.println(leapYear);
    }
}
