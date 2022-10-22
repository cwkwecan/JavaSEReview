package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 11:36
 */
public class DemoTest {


    public static void main(String[] args) {
        new A(new B());
    }
}

class A {
    public A() {
        System.out.println("A");
    }

    public A(B b) {
        this();
        System.out.println("AB");
    }
}

class B {
    public B() {
        System.out.println("B");
    }
}

