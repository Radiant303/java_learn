package com.itheima.demo2;

import com.itheima.demo3.User;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作:1登录 2注册 3忘记密码");
            getCode();
            String choose = sc.next();
            switch (choose) {
                case "1":
                    login(list);
                    break;
                case "2":
                    register(list);
                    break;
                case "3":
                    forgetPassward(list);
                    break;
                case "4":
                    System.out.println("退出");
                    System.exit(0);
                default:
                    System.out.println("输入有误");
            }
        }

    }

    private static void forgetPassward(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        boolean flag = contains(list, username);
        if (!flag) {
            System.out.println("用户名不存在");
            return;
        }
        System.out.println("请输入身份证号码：");
        String personID = sc.next();
        System.out.println("请输入手机号码：");
        String phoneNumber = sc.next();
        
        int index = findIndex(list,username);
        User user = list.get(index);
        if (!(user.getPersonId().equalsIgnoreCase(personID)&&user.getPhoneNumber().equalsIgnoreCase(phoneNumber))) {
            System.out.println("用户信息有误");
            return;
        }
        String newPassword;
        while (true) {
            System.out.println("请输入新密码：");
            newPassword = sc.next();
            System.out.println("请输入确认密码：");
            String newPassword2 = sc.next();
            if (!newPassword.equals(newPassword2)) {
                System.out.println("密码不一致");
                continue;
            }else {
                break;
            }
        }
        user.setPassword(newPassword);
        System.out.println("修改成功");
    }

    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (username.equals(user.getName())) {
                return i;
            }
        }
        return -1;
    }

    private static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String username;
        String password1;
        String password2;
        String personID;
        String phoneNumber;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            boolean flag1 = checkUserName(username);
            if (!flag1) {
                System.out.println("用户名格式错误");
            }
            boolean flag = contains(list,username);
            if (flag) {
                System.out.println("用户名已存在");
            }else{
                System.out.println("用户名"+username+"可用");
                break;
            }
        }

        //密码
        while (true) {
            System.out.println("请输入密码：");
            password1 = sc.next();
            System.out.println("请再次输入密码：");
            password2 = sc.next();
            if (!password1.equals(password2)) {
                System.out.println("密码不一致");
                continue;
            }else{
                System.out.println("密码可用");
                break;
            }
        }
        
        //身份证号码
        while (true) {
            System.out.println("请输入身份证号码：");
            personID = sc.next();
            boolean flag = checkPersonID(personID);
            if (!flag) {
                System.out.println("身份证号码格式错误");
            }else {
                System.out.println("身份证号码可用");
                break;
            }
        }

        //手机号码
        while (true) {
            System.out.println("请输入手机号码：");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (!flag) {
                System.out.println("手机号码格式错误");
            }else {
                System.out.println("手机号码可用");
                break;
            }
        }

        User user = new User(username,password1,personID,phoneNumber);
        list.add(user);
        printList(list);

    }

    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getName()+"\t"+user.getPassword()+"\t"+user.getPersonId()+"\t"+user.getPhoneNumber());
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }
        if (phoneNumber.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkPersonID(String personID) {
        if (personID.length() != 18) {
            return false;
        }
        if (personID.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < personID.length()-1; i++) {
            char ch = personID.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                return false;
            }
        }
        char last = personID.charAt(personID.length()-1);
        if ((last >= '0' && last <= '9')||(last == 'X')||(last == 'x')) {
            return true;
        }else {
            return false;
        }
    }

    private static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (username.equals(user.getName())) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkUserName(String username) {
        int length = username.length();
        if (length < 3 || length > 15) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char ch = username.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z')||(ch >= '0' && ch <= '9'))) {
                return false;
            }
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            char ch = username.charAt(i);
            if ((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z')) {
                count++;
                break;
            }
        }

        return true;
    }

    private static void login(ArrayList<User> list) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = sc.next();
            boolean flag = contains(list,username);
            if (!flag) {
                System.out.println("用户名"+username+"未注册");
                return;
            }
            System.out.println("请输入密码");
            String password = sc.next();

            while (true) {
                String code = getCode();
                System.out.println("验证码是："+code);
                System.out.println("请输入验证码");
                String code1 = sc.next();
                if (code.equalsIgnoreCase(code1)) {
                    System.out.println("验证码正确");
                    break;
                }else {
                    System.out.println("验证码错误");
                    continue;
                }
            }
            User userInfo = new User(username,password,null,null);
            boolean result = CheckUserInfo(list,userInfo);
            if (result) {
                System.out.println("登录成功,欢迎使用学生管理系统");
                StudentTest ss = new StudentTest();
                ss.startStudentSystem();
                break;
            }else {
                if (i == 2){
                    System.out.println("您已输入错误次数，请重新登录");
                }else {
                    System.out.println("您输入的密码错误，请重新输入");
                }
            }

        }

    }

    private static boolean CheckUserInfo(ArrayList<User> list, User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getName().equals(userInfo.getName()) && user.getPassword().equals(userInfo.getPassword())) {
                System.out.println("登录成功");
                return true;
            }
        }
        System.out.println("用户名或密码错误");
        return false;

    }

    private static String getCode(){
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0;i<26;i++){
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(list.size());
            char ch = list.get(index);
            sb.append(ch);
        }
        int number = random.nextInt(10);
        sb.append(number);

        char[] arr = sb.toString().toCharArray();
        int index = random.nextInt(arr.length);
        char temp = arr[index];
        arr[index] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        return new String(arr);
    }
}
