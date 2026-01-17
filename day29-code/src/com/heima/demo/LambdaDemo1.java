package com.heima.demo;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {1,5,3,1,2,7,12,9,5};
        int a = 5;
        test(b->System.out.println(b+"开始"),a);

        test(new Swim() {
            @Override
            public void swim(int a) {
                System.out.println(a+"结束");
            }
        }, a);


    }


    public static void test(Swim s,int a){
        s.swim(a);
    }

}



@FunctionalInterface
interface Swim{
    public abstract void swim(int a);
}
