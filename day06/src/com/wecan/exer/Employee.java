package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-28 14:11
 */
public abstract class Employee {
    private String name;//姓名
    private int id;//员工编号
    private double salary;//薪资

    public Employee(){

    }

    public Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //抽象方法没有方法体
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
