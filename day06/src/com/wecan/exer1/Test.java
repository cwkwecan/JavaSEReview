package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-30 20:50
 */
public class Test {

    public static void main(String[] args) {

        Platypus pt = new Platypus();
        pt.respirations();
        pt.run();
        System.out.println("****************************************");

        Sunflower sf = new Sunflower();
        sf.reproduction();
        sf.respirations();
    }
}
