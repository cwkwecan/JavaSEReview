package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-30 22:31
 */
public class ShapeTest {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.celPerimeter());

        System.out.println("****************************");

        Circle circle = new Circle(3.4);
        System.out.println(circle.celPerimeter());

    }

}
