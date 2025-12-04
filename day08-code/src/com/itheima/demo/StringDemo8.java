package com.itheima.demo;

public class StringDemo8 {
    public static void main(String[] args) {
        String phoneNumber = "13112349468";

        String start = phoneNumber.substring(0,3);
        String end = phoneNumber.substring(7);
        String middle = "****";
        String newPhoneNumber = start + middle + end;
        System.out.println(newPhoneNumber);
    }
}
