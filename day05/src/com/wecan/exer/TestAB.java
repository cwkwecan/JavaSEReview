package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-23 18:58
 */
class A {
    int a = 1;
    double d = 2.0;

    void show() {
        System.out.println("Class A: a=" + a + "\td=" + d);
    }
}

/*
    (1) 若在应用程序的main 方法中有以下语句：
    A a=new A();
    a.show();
    则输出的结果如何？ Class A: a=1    d=2.0
    (2) 若在应用程序的main 方法中定义类B 的对象b：
    A b=new B();
    b.show();
    则输出的结果如何？
    Class A: a=1    d=2.0
    Class B: a=3.0  d=Java program.
 */

class B extends A {
    float a = 3.0f;
    String d = "Java program.";

    void show() {
        super.show();
        System.out.println("Class B: a=" + a + "\td=" + d);
    }
}

public class TestAB {

    public static void main(String[] args) {

        A a = new A();
        a.show();

        System.out.println("*******************");

        A b = new B();
        b.show();
    }
}



