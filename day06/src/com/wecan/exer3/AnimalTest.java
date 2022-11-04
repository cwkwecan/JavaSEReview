package com.wecan.exer3;

/**
 * @author cwk
 * @create 2022-10-30 21:18
 */
public class AnimalTest {

    public static void main(String[] args) {

        //多态
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        a1.shout();
        a2.shout();


    }
}
