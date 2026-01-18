package com.heima.demo;

import java.util.Arrays;

public class SortDemo1 {
    public static void main(String[] args) {
        GirlFriend[] gfs = new GirlFriend[3];
        gfs[0] = new GirlFriend("zhanghuahua", 18, 152);
        gfs[1] = new GirlFriend("liming", 24, 173);
        gfs[2] = new GirlFriend("chenwa", 22, 168);

        Arrays.sort(gfs,(o1,o2)->{
            int temp = o1.getAge()-o2.getAge();

            if (temp==0) temp = o1.getHeight()-o2.getHeight();

            if (temp==0) temp = o1.getName().compareTo(o2.getName());

            return temp;
        });
        System.out.println(Arrays.toString(gfs));
    }

}
class GirlFriend{
    private String name;
    private int age;
    private int height;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    /**
     * 获取
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
