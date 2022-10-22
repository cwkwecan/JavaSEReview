package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-21 22:05
 */
public class Box {

    /*
    编程创建一个Box类，在其中定义三个变量表示一个立方体的长、宽和高，定义一个方法求立方体的体积。
    创建一个对象，求给定尺寸的立方体的体积。
    （提供无参的构造器和一个有参的构造器）
     */

    private int length;
    private int width;
    private int height;

    public Box(){

    }

    public Box(int length,int width,int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getVolume(){
        return length * width * height;
    }
}
