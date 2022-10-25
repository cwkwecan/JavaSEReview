package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-25 18:16
 */
public class EmployeeTest {

    public static void main(String[] args) {

        OrdinaryEmp oe = new OrdinaryEmp("张三",1001,10000);
        double oeBonus = oe.bonus();
        System.out.println("员工的奖金为：" + oeBonus);

        Manager manager = new Manager("老王", 1000, 20000);
        double manBonus = manager.bonus();
        System.out.println("经理的奖金为：" + manBonus);
    }
}
