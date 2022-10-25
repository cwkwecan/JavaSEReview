package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-25 17:22
 */
public class CarTest {

    public static void main(String[] args) {

        Car c1 = new Car("白色","SUV");

        Car c2 = new Car("黑色","比亚迪");

        Car c3 = new Car("白色", "SUV");

        boolean e1 = c1.equals(c2);
        System.out.println(e1);

        System.out.println(c1.equals(c3));

    }
}
