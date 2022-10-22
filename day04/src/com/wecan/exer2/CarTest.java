package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 11:09
 */
public class CarTest {

    public static void main(String[] args) {

        Car Jetta = new Car("捷达", 7, "黑色", 150);

        Car BMW = new Car("宝马", 6, "绿色", 100);

        Car RollsRoyce = new Car("劳斯莱斯", 8, "红色", 800);

        Car cruze = new Car("科鲁兹", 6, "金黄色", 120);

        Car malibu = new Car("迈锐宝", 8, "蓝色", 150);


        System.out.println(Jetta);
        System.out.println(BMW);
        System.out.println(RollsRoyce);
        System.out.println(cruze);
        System.out.println(malibu);
    }
}
