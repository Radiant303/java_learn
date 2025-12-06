package com.itheima.demo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){};

    //最大年龄
    public static int getMaxAge(ArrayList<Student> arr) {
        int max = arr.get(0).getAge();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getAge() > max) {
                max = arr.get(i).getAge();
            }
        }
        return max;
    }
}
