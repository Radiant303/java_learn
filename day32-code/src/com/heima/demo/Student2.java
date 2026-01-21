package com.heima.demo;

import java.util.Objects;

/**
 * @author wz
 */
public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private double chinese;
    private double math;
    private double english;

    public Student2() {
    }

    public Student2(String name, int age, double chinese, double math, double english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
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
     * @return chinese
     */
    public double getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public double getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(double math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public double getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(double english) {
        this.english = english;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return age == student2.age && Double.compare(chinese, student2.chinese) == 0 && Double.compare(math, student2.math) == 0 && Double.compare(english, student2.english) == 0 && Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, chinese, math, english);
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    @Override
    public int compareTo(Student2 o) {
        int sum1 = (int)(this.chinese + this.math + this.english);
        int sum2 = (int)(o.chinese + o.math + o.english);
        double i = sum1 - sum2;
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        i = i == 0 ? this.getMath() - o.getMath() : i;
        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        i = i == 0 ? this.getAge() - o.getAge() : i;
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i > 0 ? 1 : i < 0 ? -1 : 0;
    }
}
