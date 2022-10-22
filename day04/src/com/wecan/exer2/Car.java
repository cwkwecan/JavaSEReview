package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 11:02
 */
public class Car {

    /*
    写一个汽车类：
    属性：品牌；车长；颜色；价格；
    创建五个对象：“捷达”，“宝马”，“劳斯莱斯”，“科鲁兹”，“迈锐宝”
    提供无参的构造器和一个有参的构造器
     */

    private String brand;//汽车品牌
    private int length;//车长
    private String color;//颜色
    private double price;//价格

    public Car(){

    }

    public Car(String brand,int length,String color,double price){
        this.brand = brand;
        this.length = length;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
