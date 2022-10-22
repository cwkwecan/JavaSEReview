package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-21 17:58
 *
 *
 * （1）声明一个圆柱体类型，
 * （2）声明属性：底边的半径，和高
 * （3）声明方法：
 *      A：方法的功能：在方法中打印圆柱体的详细信息
 * 	       圆柱体的底边的半径是xxx，高是xxx，底面积是xxx，体积是xxx。
 *      B：方法的功能：返回底面积
 *      C：方法的功能：返回体积
 *      D：方法的功能：为圆柱体的底边的半径，和高赋值
 *      E：方法的功能：为圆柱体的底边的半径，和高赋值，并返回赋值的结果
 * 	    如果底边的半径或高为<=0，赋值失败，返回false，否则返回true
 * （4）并测试
 *
 */
public class Cylinder {

    private double radius;//底边半径
    private double height;//高

    public void printDetails(){
        System.out.println("圆柱体的底边的半径是" + radius + "，高是" + height
                + "，底面积是" + getArea() + "，体积是" + getVolume());
    }

    /**
     * 返回圆柱体的底面积
     * @return
     */
    public double getArea(){
        return 3.14 * radius * radius;
    }

    /**
     * 返回圆柱体的体积
     * @return
     */
    public double getVolume(){
        return getArea() * height;
    }

    public void setValue(double radius,double height){
        this.radius = radius;
        this.height = height;
    }

    /**
     * 方法的功能：为圆柱体的底边的半径，和高赋值，并返回赋值的结果
     * 	如果底边的半径或高为<=0，赋值失败，返回false，否则返回true
     * @param radius
     * @param height
     */
    public boolean setRadiusAndHeight(double radius,double height){//为圆柱体的半径和高赋值
        if(radius <= 0 || height <= 0){
            return false;
        }
        this.radius = radius;
        this.height = height;
        return true;
    }


}
