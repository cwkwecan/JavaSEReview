package com.wecan.exer7;

/**
 * @author cwk
 * @create 2022-10-31 15:48
 */
public class Strawberry implements Fruit {

    private boolean seedless;//无籽的

    @Override
    public void grow() {
        System.out.println("草莓正在生长");
    }

    @Override
    public void harvest() {
        System.out.println("草莓要成熟了，该收获了");
    }

    @Override
    public void plant() {
        System.out.println("种植草莓");
    }
}
