package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 11:00
 */
public class PersonTest {

    public static void main(String[] args) {

        Person p = new Person("zhangsan","male",23);

        String sIntro = p.selfIntroductino();
        System.out.println(sIntro);

        p.eat();

    }
}
