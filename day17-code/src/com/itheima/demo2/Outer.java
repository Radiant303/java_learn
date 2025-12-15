package com.itheima.demo2;

public class Outer {
    String name;
    int age;
    private int a = 10;

    private class Inner {
        private int a = 20;
        public void show() {
            int a = 30;
            System.out.println(a);
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getInner().show();
    }
}
