package com.wecan.exer8;

/**
 * @author cwk
 * @create 2022-10-31 17:35
 */
public class ComputerTest {

    public static void main(String[] args) {

        Computer c1 = new Computer(new TaiShiDisplayer());
        c1.getGs().display();
        Computer c2 = new Computer(new YeJingDisplayer());
        c2.getGs().display();
    }
}




