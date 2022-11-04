package com.wecan.circle;

import com.wecan.shape.Shape;

/**
 * @author cwk
 * @create 2022-10-30 17:58
 */
public class Circle implements Shape {

    private double radius;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return  PI * radius * radius;
    }

    public double findPerimeter(){
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
