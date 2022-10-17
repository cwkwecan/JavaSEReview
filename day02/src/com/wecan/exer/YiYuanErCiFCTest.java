package com.wecan.exer;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-16 13:00
 */
public class YiYuanErCiFCTest {

    public static void main(String[] args) {
        /*
        求ax2+bx+c=0方程的根。
        求ax2+bx+c=0方程的根。a,b,c分别为函数的参数，
        如果a≠0，那么：
        （1）当b2-4ac>0，则有两个解；
        （2）当b2-4ac=0，则有一个解；
        （3）当b2-4ac<0，则无解；
        如果a=0,b≠0，那么，

        提示1：Math.sqrt(num);  sqrt指平方根
        例如：
        求x2-4x+1=0方程的根
        求x2-2x+1=0方程的根
         */
        Scanner input = new Scanner(System.in);
        System.out.println("请输入a：");
        double a = input.nextDouble();
        System.out.println("请输入b：");
        double b = input.nextDouble();
        System.out.println("请输入c：");
        double c = input.nextDouble();

        if(a != 0){
            double delt = b * b - 4 * a * c;
            if(delt > 0){
                double x1 = (-b - Math.sqrt(delt)) / 2*a;
                double x2 = (-b + Math.sqrt(delt)) / 2*a;
                System.out.println("方程有两个不同的解，如下：");
                System.out.println("x1=" + x1 + ",x2=" + x2);
            }else if(delt == 0){
                double x = -b / 2*a;
                System.out.println("方程有两个相同的解，如下：");
                System.out.println("x1=x2=" + x);
            }else{
                System.out.println("该方程无解！");
            }
        }else{
            if(b != 0){
                double x = -c / b;
                System.out.println("该方程是一元一次方程，有一个解，如下");
                System.out.println("x=" + x);
            }else{
                System.out.println("不是方程，是一个等式");
                if(c == 0){
                    System.out.println("等式成立");
                }else{
                    System.out.println("等式不成立");
                }
            }
        }
    }
}
