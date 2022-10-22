package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-20 16:36
 */
public class Wife {

    String name;
    int age;
    Husband husband;

    public Wife(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setHusband(Husband husband){
        this.husband = husband;
    }

    public String getInfo(){
        return "本人信息：姓名:" + name + " ,年龄:" + age + "\n丈夫信息：姓名:"
                + husband.name + " ,年龄:" + husband.age;
    }
}
