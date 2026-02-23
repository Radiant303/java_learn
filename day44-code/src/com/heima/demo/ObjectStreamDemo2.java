package com.heima.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("lisi", 18);
        Student s2 = new Student("zhangsan", 20);
        Student s3 = new Student("wangwu", 19);

        ObjectOutputStream bos = new ObjectOutputStream(new FileOutputStream("day44-code\\a.txt"));
        bos.writeObject(s1);
        bos.writeObject(s2);
        bos.writeObject(s3);
        bos.close();
    }
}
