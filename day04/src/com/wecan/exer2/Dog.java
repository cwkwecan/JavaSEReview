package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-21 22:17
 */
public class Dog {

    /*
    设计一个Dog类，有名字、颜色和年龄属性，定义构造器初始化这些属性，定义输出方法show()显示其信息。
    提供无参的构造器和一个有参的构造器
     */

    private String name;//名字
    private String color;//颜色
    private int age;//年龄

    public Dog(){

    }

    public Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String show(){
        return "Dog{" + "name=" + "\'"
                + name + "\'" +", color=" + "\'" + color + "\'"
                + ", age=" + age + "}";
    }

}
