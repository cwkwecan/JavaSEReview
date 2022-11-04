package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-27 18:46
 */
public class SingletonTest2 {

    public static void main(String[] args) {


    }
}

class Order{

    //1.私有化类的构造器
    private Order(){

    }

    //2.声明当前类的对象，没有初始化
    private static Order instance = null;

    //3.声明公共的、静态的方法，返回当前类的对象
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}
