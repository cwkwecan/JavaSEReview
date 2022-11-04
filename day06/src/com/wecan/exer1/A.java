package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-30 17:45
 */
public interface A {


//    int x = 0;
}

//class B{
//    int x = 1;
//}
//
//class C extends B implements A{
//    public void pX(){
//        System.out.println(A.x);
//    }
//
//    public static void main(String[] args) {
//
//        new C().pX();
//    }
//}

class B implements A{
    public String func(){
        return "func";
    }
}

class Demo1{
    public static void main(String[] args){
        A a=new B();
//        System.out.println(a.func());
    }
}
