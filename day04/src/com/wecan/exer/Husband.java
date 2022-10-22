package com.wecan.exer;

/**
 * 编程题1
 * 定义一个丈夫Husband类，有姓名、年龄、妻子属性
 * 定义一个妻子Wife类，有姓名、年龄、丈夫属性
 * 丈夫类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和他的妻子的姓名，年龄
 * 妻子类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和她的丈夫的姓名，年龄
 * 定义一个测试类，创建妻子和丈夫对象，然后测试
 *
 * @author cwk
 * @create 2022-10-20 16:35
 */
public class Husband {

    String name;
    int age;
    Wife wife;

    public Husband(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setWife(Wife wife){
        this.wife = wife;
    }


    public String getInfo(){
        return "本人信息：姓名:" + name + " ,年龄:" + age + "\n妻子信息：姓名:"
                + wife.name + " , 年龄:" +wife.age;
    }
}
