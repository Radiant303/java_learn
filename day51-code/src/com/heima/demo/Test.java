package com.heima.demo;

public class Test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("周杰伦");
        Star star = ProxyUtil.createProxy(bigStar);
        String s = star.sing("周杰伦");
        star.dance("周杰伦");
        System.out.println(s);

    }
}
