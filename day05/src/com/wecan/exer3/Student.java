package com.wecan.exer3;

/**
 * @author cwk
 * @create 2022-10-25 18:42
 */
public class Student extends Person {

    private int no;//学号


    public Student(String name, String gender, int age, int no) {
        super(name, gender, age);
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Student){
            Student stu = (Student) o;
            return this.no == stu.no && this.getName().equals(stu.getName());
        }else{
            return false;
        }
    }
}
