package com.wecan.exer7;

/**
 * @author cwk
 * @create 2022-10-31 15:49
 */
public class Apple implements Fruit {

    private int treeAge;//树龄

    @Override
    public void grow() {
        System.out.println("苹果生长周期为8个月");
    }

    @Override
    public void harvest() {
        System.out.println("苹果该收获了");
    }

    @Override
    public void plant() {
        System.out.println("苹果种植");
    }
}
