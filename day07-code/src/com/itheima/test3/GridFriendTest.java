package com.itheima.test3;

public class GridFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("果果");
        gf1.setAge(18);
        gf1.setGender("萌妹子");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.sleep();
        gf1.eat();

        System.out.println("===============");

        GirlFriend gf2 = new GirlFriend();
        gf2.setName("小妹");
        gf2.setAge(18);
        gf2.setGender("萌妹子");
        System.out.println(gf2.getName());
        System.out.println(gf2.getAge());
        System.out.println(gf2.getGender());
        gf2.sleep();
        gf2.eat();


    }
}
