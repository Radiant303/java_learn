package com.heima.demo;

import java.util.TreeSet;

/**
 * @author wz
 */
public class A02_TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>((o1,o2) ->{
            int i = o1.length() - o2.length();
            return i != 0 ? i : o1.compareTo(o2);
        });
        s.add("c");
        s.add("ab");
        s.add("df");
        s.add("qwer");

        System.out.println(s);
    }
}
