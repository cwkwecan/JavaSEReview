package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 11:25
 */
public class CourseTest {

    public static void main(String[] args) {

        Course cCourse = new Course("c语言", 48, "张三");

        Course javaCourse = new Course("java编程", 72, "李四");

        Course phpCourse = new Course("php网络编程", 48, "王五");

        Course cplusCourse = new Course("c++", 48, "赵六");

        Course dataStructureCourse = new Course("数据结构", 48, "王八");

        System.out.println(cCourse);
        System.out.println(javaCourse);
        System.out.println(phpCourse);
        System.out.println(cplusCourse);
        System.out.println(dataStructureCourse);
    }
}
