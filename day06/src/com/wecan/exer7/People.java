package com.wecan.exer7;

/**
 * @author cwk
 * @create 2022-10-31 15:51
 */
public class People {

    public static void main(String[] args) {

        FruitGardener fg = new FruitGardener();

        Fruit fruit = fg.getFruit("苹果");

        fruit.harvest();
    }
}
