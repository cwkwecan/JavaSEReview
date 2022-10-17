package com.wecan.exer2;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-16 22:32
 */
public class TriangleTest {

    public static void main(String[] args) {
        //有3个整数，给出提示信息：
        //能否创建三角形；两边之和大于第三边  三个条件都要写
        //如果能构建三角形，提示是直角三角形还是等边三角形等腰三角形还是普通三角形；
        //最后输出三角形面积；
        Scanner input = new Scanner(System.in);
        System.out.print("请输入边a：");
        double a = input.nextDouble();
        System.out.print("请输入边a：");
        double b = input.nextDouble();
        System.out.print("请输入边a：");
        double c = input.nextDouble();

        TriangleTest test = new TriangleTest();

        if((a + b > c) && (a + c) > b && (b + c) > a){
            if(a == b && b == c){
                System.out.println("等边三角形");
            }else if(a == b || a == c || b == c){
                System.out.println("等腰三角形");
            }else{
                System.out.println("直角三角形");
            }
            double area = test.getTriangleArea(a, b, c);
            System.out.println("三角形的面积为：" + area);
        }else{
            System.out.println("该三边不能构成三角形");
        }
    }

    public double getTriangleArea(double a,double b,double c){
        double p;//周长
        double area;//面积
        p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
