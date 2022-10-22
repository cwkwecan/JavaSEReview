package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 10:54
 */
public class Person {

    /*
    写一个人的类
    属性：名字，性别，年龄；提供无参的构造器和一个有参的构造器
    方法：（1）自我介绍的方法（2）吃饭的方法
    创建一个对象“张三”
     */

    private String name;//名字
    private String gender;//性别
    private int age;//年龄

    public Person(){

    }

    public Person(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String selfIntroductino(){
        return "My name is " + name + ", " + gender + ", age " + age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
