package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-23 19:45
 */
public class Faculty extends Employee{

    private String degree;//学位
    private String level;//级别

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
