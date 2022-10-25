package com.wecan.exer6;

/**
 * @author cwk
 * @create 2022-10-25 21:37
 */
public class Test {

    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Sub();
    }
}
class Base{
    Base(){
        method(100);
    }
    public void method(int i){
        System.out.println("base : " + i);
    }
}
class Sub extends Base{
    Sub(){
        super.method(70);
    }
    public void method(int j){
        System.out.println("sub : " + j);
    }
}

