package com.wecan.exer3;

/**
 * @author cwk
 * @create 2022-11-05 9:41
 *
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 *
 */
public class BankTest {

}

class Bank{

    //1、私有化类的构造器
    private Bank(){

    }

    //2、内部声明类的对象
    private static Bank instance = null;

    //3、提供公共的、静态的方法，返回类的对象
    public static Bank getInstance(){
        //方式1：效率稍差
        //原因：多个线程同时进入同步代码块，首先抢到cpu资源的线程，拿到Bank类的的实例后走了，
        //但是后面的线程还一直在等着判断instance是否是null，后面的线程都需要再判断一次，效率低
//        synchronized (Bank.class){
//            if(instance == null){
//                instance = new Bank();
//            }
//            return instance;
//        }

        //方式2：效率高
        //原因：多个线程一同进来先判断Bank类的对象是否是null，不是的话，进入到synchronized这一块，
        //再判断实例是否为null，是的话，造一个对象，完了出去。
        // 此时，是有一些线程进入到synchronized里，但是后面的很多很多线程不必再等了，进来方法后，直接
        //拿着Bank类的唯一一个实例后就走了。
        if(instance == null){
            synchronized (Bank.class){
                if(instance == null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
