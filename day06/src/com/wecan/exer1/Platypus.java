package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-30 20:42
 */

//鸭嘴兽类
public class Platypus implements Creature,Animal{


    @Override
    public void respirations() {
        System.out.println("鸭嘴兽是动物，需要呼吸氧气");
    }

    @Override
    public void run() {
        System.out.println("鸭嘴兽只有两只脚，它可以用两只脚奔跑");
    }
}
