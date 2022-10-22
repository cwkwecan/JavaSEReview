package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-21 22:09
 */
public class Circle {

    /*
    定义一个圆类型
    提供显示圆周长功能的方法
    提供显示圆面积的方法
    提供无参的构造器和一个有参的构造器
     */

    private double radius;//半径

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
