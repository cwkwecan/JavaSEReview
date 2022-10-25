package com.wecan.exer5;

/**
 * @author cwk
 * @create 2022-10-25 21:08
 */
public class PersonTest {

    public static void main(String[] args) {

        A c = new B();

        c.setA(5);

        System.out.println(c.getA());//0

    }

}

class A {
    private int a;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

class B extends A {
    private int a;

    public void setA(int a) {
        this.a = a;
    }
//     public int getA(){
//     return a;
//     }
}
