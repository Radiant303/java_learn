package com.heima.demo;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("lisi");
        try {
            student.setAge(100);
        } catch (RuntimeException e) {
            String string = e.toString();
            System.out.println(string);
            e.printStackTrace();
        }
        System.out.println(student);

    }
}
