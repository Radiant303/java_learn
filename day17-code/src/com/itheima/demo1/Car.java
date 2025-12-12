package com.itheima.demo1;

public class Car {
     String carName;
     int age ;
     String carColor;
     public void run(){
         Engine e = new Engine();
         System.out.println(e.engineName);
         System.out.println(carName+"正在启动");
     }

     class Engine{
         String engineName;
         int engineAge;

         public void run(){
             System.out.println(engineName+carName);
         }
     }

}
