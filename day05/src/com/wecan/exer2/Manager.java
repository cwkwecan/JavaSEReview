package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-25 18:08
 */
public class Manager extends Employee {

    private final double bonusXs = 2.0;//将近蜥属

    public Manager() {
    }

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public double bonus() {
        return getSalary() * bonusXs;
    }
}
