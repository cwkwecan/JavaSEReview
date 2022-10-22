package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-21 18:48
 */
public class Student1 extends Person {

    public static void main(String[] args) {

        Student1 st = new Student1();
        st.name = "我是同包的子类";

        st.eat();
    }
}
