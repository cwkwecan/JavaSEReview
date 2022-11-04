package com.wecan.exer8;

/**
 * @author cwk
 * @create 2022-10-31 18:52
 */
public class Demo {
    private static int j = 0;

    private static boolean methodB(int k) {
        j += k;
        return true;
    }

    public static void methodA(int i) {
        boolean b;
        b = i < 10 | methodB(4);
        b = i < 10 || methodB(8);
    }

    public static void main(String args[]) {
        methodA(0);
        System.out.println(j);
    }
}

