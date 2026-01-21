package com.heima.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * @author wz
 */
public class A01_SetDemo1 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("张三");
        s.add("张四");
        s.add("张五");
//        System.out.println(s.add("张si"));
//        System.out.println(Arrays.toString(s.toArray()));

        for (String next : s) {
            System.out.println(next);
        }

        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
                System.out.println(s);
            }
        });
        s.forEach(str->{System.out.println(str );
        System.out.println(str);});
    }
}
