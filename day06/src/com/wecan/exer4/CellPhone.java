package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-31 11:55
 */
public class CellPhone {

    //计算器类（静态的成员内部类）
    static class Calculator{
        public void work(){
            System.out.println("计算器做一系列的运算");
        }
    }

    //时钟类
    static class Clock{
        public void work(){
            System.out.println("时钟用来计时");
        }
    }

}
