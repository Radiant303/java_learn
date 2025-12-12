package com.itheima.api2;

public class PingPangSporter extends Sporter implements English{
    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    public PingPangSporter() {
    }

    @Override
    public void speakEnglish() {
        System.out.println("PingPangSporter speakEnglish");
    }

    @Override
    public void study() {
        System.out.println("PingPangSporter study");
    }
}
