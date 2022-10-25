package com.wecan.exer6;

/**
 * @author cwk
 * @create 2022-10-25 21:30
 */
public class StudentTest {

    public static void main(String[] args) {

        Person p = new Person("ZhangSan",23);

        Student stu = new Student("LiSi",18,1001,90);

        System.out.println(p.say());
        System.out.println(stu.say());

    }
}
