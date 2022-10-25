package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-25 18:07
 */
public class OrdinaryEmp extends Employee{

    private final double bonusXs = 1.5;//奖金系数

    public OrdinaryEmp() {
    }

    public OrdinaryEmp(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public double bonus() {
        return getSalary() * bonusXs;
    }
}
