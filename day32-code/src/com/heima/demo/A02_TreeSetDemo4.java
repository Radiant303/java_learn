package com.heima.demo;

import java.util.TreeSet;

/**
 * @author wz
 */
public class A02_TreeSetDemo4 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan", 23, 90, 80, 70);
        Student2 s2 = new Student2("lisi", 24, 40, 56, 78);
        Student2 s3 = new Student2("wangwu", 25, 80, 32, 50);
        Student2 s4 = new Student2("zhaoliu", 26, 26, 90, 73);
        Student2 s5 = new Student2("zhaoliu", 26, 80, 44, 14);

        TreeSet<Student2> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //System.out.println("ts = " + ts);
        for (Student2 s : ts) {
            System.out.println(s+""+(s.getChinese()+s.getMath()+s.getEnglish()));
        }
    }
}
