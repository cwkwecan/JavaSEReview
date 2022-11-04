package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-31 11:40
 *
 * 设计公司类（Lenovo）,有一个接口类Works,里面有接口work()，下面有2个部门（开发部和销售部）,
 * 使用内部类分别实现开发部和销售部的工作。
 *
 */

//联想公司
public class Lenovo {


    //开发部门
    //静态内部类
    static class DevelopmentDept implements Works{

        @Override
        public void work() {
            System.out.println("开发部门研发产品");
        }
    }

    //销售部门
    //非静态内部类
    class SalesDept implements Works{

        @Override
        public void work() {
            System.out.println("销售部门销售产品");
        }
    }

    public static void main(String[] args) {

        //创建DevelopmentDept类的实例（静态的成员内部类）
        Lenovo.DevelopmentDept dev = new Lenovo.DevelopmentDept();
        dev.work();

        Lenovo len = new Lenovo();

        //创建SalesDept类的实例（非静态的成员内部类）
        SalesDept s = len.new SalesDept();
        s.work();

    }
}
