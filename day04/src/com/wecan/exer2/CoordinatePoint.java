package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-21 22:52
 */
public class CoordinatePoint {

    /*
        定义一个类，用于描述坐标点
              0 ——————>X
              |
              |
              |          P(X,Y)
              |
              |
              Y

    （1）具有计算当前点到原点距离的功能
    （2）求到任意一点（m，n）的距离
    （3）求到任意一点（Point p）的距离
    （4）具有坐标点显示功能，显示格式（x，y）
    （5）提供无参的构造器和一个有参的构造器
     */

    private double x;
    private double y;

    public CoordinatePoint(){

    }

    public CoordinatePoint(double x,double y){
        this.x = x;
        this.y = y;
    }

    /**
     * 获取当前点到原点的距离
     * @return
     */
    public double getOriginPointDistance(){

        double startX = 0;
        double startY = 0;
        double xDiff = x - startX;//当前x与原点的差
        double yDiff = y - startY;//当前y与原点的差

        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));

    }

    /**
     * 求到任意一点（m，n）的距离
     * @param m
     * @param n
     * @return
     */
    public double getRandomPointDistance(double m,double n){
        double xDiff = x - m;
        double yDiff = y - n;
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    /**
     * 求到任意一点（Point p）的距离
     * @return
     */
    public double getRandPointDist(Point p){
        double xDiff = x - p.getRandX();
        double yDiff = y - p.getRandY();
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    /**
     * 显示坐标点，格式为：(x,y)
     * @return
     */
    public String showCoordinatePoint(){
        return "(" + (int)x + "," + (int)y + ")";
    }

}
