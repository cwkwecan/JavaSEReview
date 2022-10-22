package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-21 18:14
 */
public class CylinderTest {

    public static void main(String[] args) {

        Cylinder c = new Cylinder();

        c.setValue(2.0,30);

        System.out.println(c.getArea());
        System.out.println(c.getVolume());
        c.printDetails();
        boolean isTrue = c.setRadiusAndHeight(-1, 0);
        if (isTrue) {
            System.out.println("圆柱的半径和高赋值成功");
        }else{
            System.out.println("请检查半径和高是否都大于0");
        }
    }
}
