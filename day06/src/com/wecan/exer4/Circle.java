package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-30 22:29
 */
public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double celPerimeter() {
        return 2 * 3.14 * radius;
    }
}
