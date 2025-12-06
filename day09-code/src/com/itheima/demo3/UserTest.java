package com.itheima.demo3;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        loop:while (true) {
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.退出");
            switch (sc.next()) {
                case "1"->register(list);
                case "2"->login(list);
                case "3"->{
                    System.out.println("退出系统");
                    break loop;
                }
            }
        }

    }
    //注册
    public static boolean register(ArrayList<User> list) {
        User u = new User();
        String name = inputName(list);
        String pwd = inputPwd(list);
        String id = inputId();
        String phone = inputPhone();
        u.setName(name);
        u.setPassword(pwd);
        u.setPersonId(id);
        u.setPhoneNumber(phone);
        list.add(u);
        return true;
    }
    //判断用户是否唯一
    public static int getIndex(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    //登录
    public static boolean login(ArrayList<User> list) {
        int count = 0;
        while (count!=3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(name) && list.get(i).getPassword().equals(pwd))
                {
                    System.out.println("登录成功");
                    return true;
                }
            }
            System.out.println("登录失败");
            count++;
        }
        System.out.println("尝试次数过多，请稍后再试");
        return false;
    }
    //用户名鉴定
    public static String inputName(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        while (getIndex(list, name) != -1) {
            System.out.println("用户名已存在，请重新输入");
            name = sc.next();
        }
        if (name.length() >= 3 && name.length() <= 15){
            int count = 0;
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z' || name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' || name.charAt(i) >= '0' && name.charAt(i) <= '9'){
                    if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z' || name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'){
                        count++;
                    }
                }
            }
            if(count>0){
                return name;
            }else {
                System.out.println("用户名包含字母和数字且不能为纯数字");
                return inputName(list);
            }
        }else {
            System.out.println("用户名长度必须在3-15之间");
            return inputName(list);
        }
    }
    //密码鉴定
    public static String inputPwd(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码：");
        String pwd1 = sc.next();
        System.out.println("请再次输入密码：");
        String pwd2 = sc.next();
        while (!pwd1.equals(pwd2)) {
            System.out.println("密码不一致，请重新输入");
            pwd1 = sc.next();
            pwd2 = sc.next();
        }
        return pwd1;
    }
    //身份证鉴定
    public static String inputId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证：");
        String id = sc.next();
        while (id.length() != 18 || id.charAt(0) == '0') {
            System.out.println("身份证长度必须为18位");
            id = sc.next();
        }
        for (int i = 0; i < id.length()-1; i++) {
            if (id.charAt(i) < '0' || id.charAt(i) > '9'){
                System.out.println("身份证格式错误,重新输入");
                return inputId();
            }
        }
        return id;
    }
    //手机号鉴定
    public static String inputPhone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phone = sc.next();
        while (phone.length() != 11 || phone.charAt(0) == '0') {
            System.out.println("手机号长度必须为11位");
            phone = sc.next();
        }
        for (int i = 0; i < phone.length(); i++) {
            if (phone.charAt(i) < '0' || phone.charAt(i) > '9'){
                System.out.println("手机号格式错误,重新输入");
                return inputPhone();
            }
        }
        return phone;
    }
}
