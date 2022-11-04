package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-30 22:23
 */
public class Student extends Person {
    @Override
    public void work() {
        System.out.println("认真学习");
    }

    @Override
    public void hello() {
        System.out.println("老师好");
    }
}
