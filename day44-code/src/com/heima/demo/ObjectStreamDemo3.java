package com.heima.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day44-code\\a.txt"));
        Student o1 = (Student) ois.readObject();
        Student o2 = (Student) ois.readObject();
        Student o3 = (Student) ois.readObject();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        try {
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
