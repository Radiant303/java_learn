package com.itheima.polymprphismdemo2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
//    public void keepPet(Dog dog, String something){
//        System.out.println("年龄为" + age + "的" + name + "养了一只" + dog.getColor() + "的" + dog.getAge() + "岁的狗");
//        dog.eat(something);
//    }
//    public void keepPet(Cat cat, String something){
//        System.out.println("年龄为" + age + "的" + name + "养了一只" + cat.getColor() + "的" + cat.getAge() + "岁的猫");
//        cat.eat(something);
//    }
    public void keepPet(Animal animal, String something){
        if(animal instanceof Cat c){
            System.out.println("年龄为" + age + "的" + name + "养了一只" + animal.getColor() + "的" + animal.getAge() + "岁的猫");
            c.catchMouse();
        }else if(animal instanceof Dog d){
            System.out.println("年龄为" + age + "的" + name + "养了一只" + animal.getColor() + "的" + animal.getAge() + "岁的狗");
            d.lookHome();
        }else {
            System.out.println("年龄为" + age + "的" + name + "养了一只" + animal.getColor() + "的" + animal.getAge() + "岁的动物");
            animal.eat(something);
        }

    }
}
