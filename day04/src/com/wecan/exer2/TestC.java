package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 23:04
 */
public class TestC {


    int x = 12;

    public void method(int x) {
        x += x;
        System.out.println(x);
    }

    public static void main(String[] args) {

        TestC t = new TestC();
        t.method(5);
    }
}


