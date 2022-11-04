package com.wecan.exer7;

/**
 * @author cwk
 * @create 2022-10-31 15:46
 */
public class Grape implements Fruit {

    private boolean coteless;//无棚的

    @Override
    public void grow() {
        System.out.println("葡萄正在生长");
    }

    @Override
    public void harvest() {
        System.out.println("收获葡萄");
    }

    @Override
    public void plant() {
        System.out.println("种植葡萄");
    }
}
