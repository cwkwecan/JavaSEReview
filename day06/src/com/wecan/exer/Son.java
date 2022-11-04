package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-27 19:36
 *
 * 由父及子，静态先行。
 *
 */

class Father{

    static{
        System.out.println("1111111111111111111");
    }
    {
        System.out.println("2222222222222222222");
    }

    public Father(){
        System.out.println("3333333333333333333");
    }

}

public class Son extends Father{
    static {
        System.out.println("44444444444");
    }
    {
        System.out.println("55555555555");
    }
    public Son() {
        System.out.println("66666666666");
    }


    public static void main(String[] args) { // 由父及子 静态先行
        System.out.println("77777777777");
        System.out.println("************************");
        new Son();
        System.out.println("************************");
        new Son();
        System.out.println("************************");
        new Father();
    }
}
