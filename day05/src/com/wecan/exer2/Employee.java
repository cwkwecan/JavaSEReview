package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-25 18:03
 *
 * 定义员工类Employee，包含姓名、工号和工资，包含计算奖金方法bonus，
 * 普通员工和经理都是员工，计算奖金的方法为工资*奖金系数，
 * 普通员工的奖金系数为1.5（常量），
 * 经理为2（常量），分别实现bonus方法，创建对象测试。
 *
 */
public class Employee {

    private String name;//姓名
    private int id;//工号
    private double salary;//工资

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double bonus(){
        return 0.0;
    }

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
