package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-21 23:18
 */
public class Point {

    private double randX;//任意点的x坐标
    private double randY;//任意点的y坐标

    public Point(){

    }

    public Point(double randX,double randY){
        this.randX = randX;
        this.randY = randY;
    }

    public double getRandX() {
        return randX;
    }

    public void setRandX(double randX) {
        this.randX = randX;
    }

    public double getRandY() {
        return randY;
    }

    public void setRandY(double randY) {
        this.randY = randY;
    }
}
