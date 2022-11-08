package com.wecan.exer3;

/**
 * @author cwk
 * @create 2022-11-05 12:13
 */
public class Test1 {

//    public static void main(String[] args) {
//
//        System.out.println(test4());
//    }
//
//    public static int test4(){
//        int i = 1;
//
//        try{
//            i++;
//            System.out.println("try block i = " + i);
//            return i;
//        }catch(Exception e){
//            i++;
//            System.out.println("catch block i = " + i);
//            return i;
//        }finally{
//            i++;
//            System.out.println("finally block i = " + i);
//            return i;
//        }
//    }


    private static void change(int i){
        i = 10;
    }

    public static void main(String[] args) {
        int i = 5;
        change(5);
        System.out.println(i);
    }
}
