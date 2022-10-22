package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-21 22:12
 */
public class CircleTest {

    public static void main(String[] args) {

        Circle circle = new Circle(3.0);

        double perimeter = circle.getPerimeter();
        System.out.println("圆的周长为：" + perimeter);
        double area = circle.getArea();
        System.out.println("圆的面积为：" + area);
    }
}
