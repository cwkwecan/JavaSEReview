package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-30 22:27
 */
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double celPerimeter() {
        return a + b + c;
    }
}
