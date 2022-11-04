package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-11-03 21:38
 */
public class EcTest1 {

//    public static void main(String[] args) {
//
//        try {
//            int[] arr = new int[]{1,2,3,4,5};
//            System.out.println(arr[5]);
//        } finally {
//            System.out.println("我是可能出现的异常，但是没有被处理");
//        }
//
//    }

    public static void main(String[] args) {

        EcTest1.m1();
    }

    public static void m1(){
        Animal a = null;
        a.eat();
    }



}
