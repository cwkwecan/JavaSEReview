package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-28 11:47
 */
public class SingletonTest {

    public static void main(String[] args) {

    }
}

class Bank3{

    //1.私有化类的构造器
    private Bank3(){

    }

    //2.内部声明当前类的对象
    //4.要求此对象也必须声明为static的
    private static Bank3 instance = new Bank3();

    //3.提供公共的、静态的方法，返回类的对象
    public static Bank3 getInstance(){
        return instance;
    }


}

class Bank4{

    //1.私有化类的构造器
    private Bank4(){

    }

    //2.声明当前类的对象，没有初始化
    //4.要求此对象也必须声明为static的
    private static Bank4 instance = null;

    //3.提供公共的、静态的方法，返回类的对象
    //目前是线程不安全的
    public static Bank4 getInstance(){
        if(instance == null){
            instance = new Bank4();
        }
        return instance;
    }

}
