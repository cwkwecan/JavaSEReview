package com.wecan.exer6;

/**
 * @author cwk
 * @create 2022-10-25 21:27
 */
public class Student extends Person {

    private int id;
    private int score;

    public Student() {
    }

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    @Override
    public String say(){
        return super.say() + " id=" + id + ",socre=" + score;
    }


}
