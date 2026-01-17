package com.heima.demo;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {
        String s[] = {"LoveMony","helo","world","javaaaa"};

        Arrays.sort(s,(a,b)->a.length()-b.length());
        System.out.println(Arrays.toString(s));
        for (int i = 0; i < s.length; i++) {
            
        }
    }
}
