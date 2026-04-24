package com.heima.demo;

public class BigStar implements Star{
    private String name;

    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    public String sing(String name){
        System.out.println(name + "正在唱：大鱼");
        return "谢谢";
    }

    public void dance(String name){
        System.out.println(name +"正在跳舞");
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

    public String toString() {
        return "BigStar{name = " + name + "}";
    }
}
