package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 11:22
 */
public class Course {

    /*
    写一个课程类：
    属性：课程名；学时；任课老师；
    创建五个对象：“c语言”，“java编程”，“php网络编程”，“c++”，“数据结构”
    提供无参的构造器和一个有参的构造器
     */

    private String courseName;
    private int hour;//学时
    private String teacherName;//任课老师

    public Course(){

    }

    public Course(String courseName, int hour, String teacherName) {
        this.courseName = courseName;
        this.hour = hour;
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", hour=" + hour +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
