package com.wecan.moren;

import com.wecan.circle.Circle;
import com.wecan.cylinder.Cylinder;

/**
 * @author cwk
 * @create 2022-10-30 18:17
 */
public class X5_3_6 {

    public static void main(String[] args) {

        Circle cir1 = new Circle(2.3);
        Circle cir2 = new Circle(3.4);

        System.out.println("圆cir1的面积为：" + cir1.findArea());
        System.out.println("圆cir2的面积为：" + cir2.findArea());
        System.out.println("圆cir1的周长为：" + cir1.findPerimeter());
        System.out.println("圆cir2的周长为：" + cir2.findPerimeter());

        System.out.println("*****************************************");

        Cylinder cy1 = new Cylinder(2.3,2);
        Cylinder cy2 = new Cylinder(3.4,5);

        System.out.println("cy1底圆的面积为：" + cy1.findArea());
        System.out.println("cy2底圆的面积为：" + cy2.findArea());

        System.out.println("cy1的表面积为：" + cy1.getArea());
        System.out.println("cy2的表面积为：" + cy2.getArea());

        System.out.println("cy1的体积为：" + cy1.findVolume());
        System.out.println("cy2的体积为：" + cy2.findVolume());
    }
}
