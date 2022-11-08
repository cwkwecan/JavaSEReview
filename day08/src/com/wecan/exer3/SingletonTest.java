package com.wecan.exer3;

/**
 * @author cwk
 * @create 2022-11-05 13:18
 */
public class SingletonTest {
}

//单例模式——饿汉式1（线程安全的）
class Singleton1{
    //1、私有化类的构造器
    private Singleton1(){}

    //2、内部声明类的对象
    private static Singleton1 instance1 = new Singleton1();

    //3、提供公共的、静态的方法，返回类的对象
    public static Singleton1 getInstance1(){
        return instance1;
    }

}

//单例模式--饿汉式2（线程安全的）
class Singleton3{
    //1、私有化类的构造器
    private Singleton3(){}

    //2、内部声明类的对象，没有初始化
    private static Singleton3 instance3 = null;

    //3、静态代码块内实例化类
    //静态代码块随着类的加载而执行，而且只执行一次
    //因此，只会创建一个对象
    static{
        instance3 = new Singleton3();
    }

    //4、提供私有的静态的方法，返回类的对象
    private static Singleton3 getInstance3(){
        return instance3;
    }
}

//单例模式——懒汉式（使用同步机制，让其线程安全）
class Singleton2{
    //1、私有化类的构造器
    private Singleton2(){}

    //2、内部声明类的对象，但赋值为null
    private static Singleton2 instance2 = null;

    //3、提供公共的、静态的方法，返回类的对象
    public static Singleton2 getInstance2(){
        if(instance2 == null){
            synchronized (Singleton2.class){
                if(instance2 == null){
                    instance2 = new Singleton2();
                }
            }
        }
        return instance2;
    }
}