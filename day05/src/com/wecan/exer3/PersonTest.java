package com.wecan.exer3;

/**
 * @author cwk
 * @create 2022-10-25 18:47
 */
public class PersonTest {

    public static void main(String[] args) {

        Student s1 = new Student("张三","男",23,1001);
        Student s2 = new Student("李四","男",21,1002);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        boolean isEqual = s1.equals(s2);
        if(isEqual){
            System.out.println("两个学生是同一个学生");
        }else{
            System.out.println("两个学生不是同一个学生");
        }
    }
}
