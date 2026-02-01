package com.heima.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> manlist = new ArrayList<>();
        ArrayList<String> womanlist = new ArrayList<>();
        Collections.addAll(manlist, "张三,24", "张三丰,23", "张无忌,34", "问天,33", "鳖昭,15");
        Collections.addAll(womanlist, "文心,17", "王昭君,18", "小昭,19", "小圆,14", "小九,11");

        Stream<String> stream1 = manlist.stream()
                .filter(s -> s.split( ",")[0].length() == 3)
                .limit(2);

        Stream<String> stream2 = womanlist.stream()
                .filter(s -> s.split(",")[0].startsWith("小"))
                .skip(1);

        List<Actor> list = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
class Actor {
    private String name;
    private int age;

    public Actor() {
    }

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Actor{name = " + name + ", age = " + age + "}";
    }
}