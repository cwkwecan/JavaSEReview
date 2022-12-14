package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-27 18:38
 *
 * 单例设计模式：
 *      就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
 *
 */
public class SingletonTest1 {

    public static void main(String[] args) {

//        Bank bank = new Bank();

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1);
        System.out.println(bank2);

        System.out.println(bank1 == bank2);

    }
}

//饿汉式
class Bank{

    //1.私有化类的构造器
    private Bank(){

    }

    //2.内部声明类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank instance = new Bank();

    //3.提供public、static的方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
