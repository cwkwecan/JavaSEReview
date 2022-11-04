package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-30 20:44
 */
public class Sunflower implements Creature,Plant {


    @Override
    public void respirations() {
        System.out.println("太阳花是植物，可以吸收二氧化碳，呼出氧气");
    }

    @Override
    public void reproduction() {
        System.out.println("太阳花可以用种子繁殖，也可以用枝条繁殖");
    }
}
