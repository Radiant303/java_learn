package com.itheima.api2;

public class Test {
    public static void main(String[] args) {
        PingPangSporter p = new PingPangSporter("张三", 20);
        System.out.println(p.getName()+p.getAge());
        p.study();
        p.speakEnglish();
    }
}
