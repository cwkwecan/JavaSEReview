package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-23 19:41
 */
public class Employee extends Person{

    private String office;//办公室
    private double wage;//工资
    private String hiredate;//雇佣日期

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
