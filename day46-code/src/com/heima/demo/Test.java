package com.heima.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("day46-code\\names.txt"));
        String line;
        while ((line = br.readLine()) != null){
            String[] arr = line.split("-");
            Student stu = new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();

        //计算权重总和
        double weight = 0;
        for (Student stu:list){
            weight = weight + stu.getWeight();
        }
        //计算每一个人的实际占比
        double[] arr = new double[list.size()];
        int index = 0;
        for (Student student : list) {
            arr[index] = student.getWeight() / weight;
            index++;
        }
        //计算每一个人的权重占比范围
        for (int i = 1; i <arr.length ; i++) {
            arr[i] = arr[i] + arr[i-1];
        }

        //获取随机数0.0 - 1.0
        double random = Math.random();

        //判断number在arr中的位置
        int i = -(Arrays.binarySearch(arr, random)+1);

        //获取索引处学生信息
        Student stu = list.get(i);
        System.out.println(stu);

        //修改学生权重 /2 再写回
        stu.setWeight(stu.getWeight()/2);
        list.set(i,stu);
        BufferedWriter bw = new BufferedWriter(new FileWriter("day46-code\\names.txt"));
        for (Student student : list) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
        System.out.println(list);


    }
}
