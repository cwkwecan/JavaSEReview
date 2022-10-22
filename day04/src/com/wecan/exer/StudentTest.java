package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-20 16:30
 */
public class StudentTest {

    public static void main(String[] args) {

        Student s = new Student();
        s.name = "雷哥";
        s.age = 21;
        s.gender = "男";
        s.id = 1001;
        s.score = 100.0;

        String str = s.say();
        System.out.println(str);

    }
}
