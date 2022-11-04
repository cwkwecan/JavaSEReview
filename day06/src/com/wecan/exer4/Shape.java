package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-30 22:25
 */
public abstract class Shape {

    private String color;//颜色

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double celPerimeter();
}
