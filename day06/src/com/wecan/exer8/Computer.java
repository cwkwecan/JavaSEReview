package com.wecan.exer8;

/**
 * @author cwk
 * @create 2022-10-31 17:29
 */
public class Computer {

    private Graphoscope gs;//电子计算机显示器

    public Computer() {
    }

    public Computer(Graphoscope gs) {
        this.gs = gs;
    }

    public Graphoscope getGs() {
        return gs;
    }

    public void setGs(Graphoscope gs) {
        this.gs = gs;
    }
}
