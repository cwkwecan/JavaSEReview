package com.wecan.exer6;

/**
 * @author cwk
 * @create 2022-10-25 21:25
 */
public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String say(){
        return "My name is " + name + ". I am " + age + " years old!";
    }
}
