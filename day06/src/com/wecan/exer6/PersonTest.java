package com.wecan.exer6;

/**
 * @author cwk
 * @create 2022-10-31 15:05
 */
public class PersonTest {

    public static void main(String[] args) {

        Person p = new Person("唐僧", new Horse());

        p.common();

        p.passRiver();
    }
}
