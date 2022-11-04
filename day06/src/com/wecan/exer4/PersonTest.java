package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-30 22:24
 */
public class PersonTest {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.hello();
        teacher.work();
        System.out.println("*********************************");
        student.work();
        student.hello();
    }
}
