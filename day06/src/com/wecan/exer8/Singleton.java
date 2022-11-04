package com.wecan.exer8;

/**
 * @author cwk
 * @create 2022-10-31 18:39
 */
public class Singleton {

    ///1.私有化类的构造器
    private Singleton(){

    }

    //2.内部声明类的构造器
    //4.要求此对象也必须是静态的，因为静态方法里不能调用非静态的属性
    private static Singleton instance = new Singleton();


    //3.提供公共的、静态的方法，返回类的对象
    public static Singleton getInstance(){
        return instance;
    }
}

//单例模式2：
class Bank{

    private Bank(){

    }

    private static Bank instance = null;

    public static synchronized Bank getInstance(){
        if(instance == null){
            instance = new Bank();
        }
        return instance;
    }
}
