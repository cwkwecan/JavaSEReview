package com.wecan.cylinder;

import com.wecan.circle.Circle;

/**
 * @author cwk
 * @create 2022-10-30 18:01
 */
public class Cylinder extends Circle {

    private double height;//圆柱体的高

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getArea() {
        //圆柱体的表面积 = 2 * PI * r + PI * r * r
        return 2 * super.findArea() + super.findPerimeter() * height;
    }

    public double findVolume(){
        //圆柱体的体积 = 底面积 * 高
        return super.findArea() * height;
    }
}
