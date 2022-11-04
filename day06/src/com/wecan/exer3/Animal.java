package com.wecan.exer3;

/**
 * @author cwk
 * @create 2022-10-30 21:14
 *
 * 按要求实现下列问题：
 * 1）	动物类Animal包含了抽象方法  abstract void shout()；
 * 2）	Cat类继承了Animal，并实现方法shout，打印“猫会喵喵叫”
 * 3）	Dog类继承了Animal，并实现方法shout，打印“狗会汪汪叫”
 * 4）	在测试类中实例化对象Animal a1 =new  Cat(),并调用a1的shout方法
 * 5）	在测试类中实例化对象Animal a2 =new  Dog(),并调用a2的shout方法
 *
 */
public abstract class Animal {

    abstract void shout();
}
