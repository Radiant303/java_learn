package com.itheima.demo2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void startStudentSystem() {
        ArrayList<Student> list = new ArrayList<Student>();
        loop: while (true) {
            System.out.println("---------------欢迎来到学生管理系统---------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1"->addStudent(list);
                case "2"->deleteStudent(list);
                case "3"->updateStudent(list);
                case "4"->queryStudent(list);
                case "5"->{
                    System.out.println("退出系统");
                    break loop;
                }
                default -> System.out.println("输入有误，请重新输入");
            }
        }


    }
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生id：");
        String id = sc.next();
        if (contains(list, id)) {
            System.out.println("id已存在，请重新输入");
            return;
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();

        System.out.println("请输入学生地址：");
        String address = sc.next();

        Student s = new Student(name, age, id, address);
        list.add(s);
        System.out.println("添加成功√√√√√√√√√√√√√√√√√√√√");
    }
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id：");
        String id = sc.next();
        int index = getIndexById(list, id);
        if (index == -1) {
            System.out.println("无此id");
        } else {
            list.remove(index);
            System.out.println("删除成功√√√√√√√√√√√√√√√√√√√√");
        }
    }
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的id：");
        String id = sc.next();
        int index = getIndexById(list, id);
        if (index == -1) {
            System.out.println("无此id");
        } else {
            Student s = list.get(index);
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            System.out.println("请输入学生地址：");
            String address = sc.next();
            Student newStudent = new Student(name, age, id, address);
            list.set(index, newStudent);
        }
    }
    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查询学生");
        if (list.size() == 0) {
            System.out.println("无学生信息");
            return;
        }
        System.out.println("id\t姓名\t年龄\t地址");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
        }
    }

    //判断id是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        return getIndexById(list, id) >= 0;
    }

    //通过id获取索引
    public static int getIndexById(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
