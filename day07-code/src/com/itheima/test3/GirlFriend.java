package com.itheima.test3;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >=18 && age <= 50) {
            this.age = age;
        }else {
            System.out.println("你输入的age有误");
        }
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public void sleep() {
        System.out.println(name + "正在睡觉");
    }
    public void eat() {
        System.out.println(name + "正在吃东西");
    }

}
