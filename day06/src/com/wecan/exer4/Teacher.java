package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-30 22:23
 */
public class Teacher extends Person {
    @Override
    public void work() {
        System.out.println("教书育人");
    }

    @Override
    public void hello() {
        System.out.println("同学好");
    }
}
