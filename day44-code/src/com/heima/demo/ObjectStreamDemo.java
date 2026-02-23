package com.heima.demo;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("lisi", 18);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day44-code\\a.txt"));

        oos.writeObject(s1);
        oos.close();

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day44-code\\a.txt"));
        Student s2 = (Student) ois.readObject();
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2);
    }
}
