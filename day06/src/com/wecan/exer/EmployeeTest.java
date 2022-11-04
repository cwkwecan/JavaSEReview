package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-28 14:22
 */
public class EmployeeTest {

    public static void main(String[] args) {

        //多态
        Employee manager = new Manager("大佬",1001,50000,2000);

        //编译期间，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
        //总结：编译，看左边；运行，看右边。
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();

    }
}
