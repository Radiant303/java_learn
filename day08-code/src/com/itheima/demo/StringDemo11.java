package com.itheima.demo;

public class StringDemo11 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello").append("world").append(2020);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        System.out.println(sb.toString());
    }
}
/*
StringBuilder类
    StringBuilder()
    StringBuilder(String str)
    StringBuilder append(...)
    String toString()
    int length()
    char charAt(int index)
    String substring(int start, int end)
    void setCharAt(int index, char ch)
    void insert(int offset, String str)
    void delete(int start, int end)
    void reverse()
 */