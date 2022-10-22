package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-21 17:51
 */
public class Test1 {
    public static boolean foo(char c) {
        System.out.print(c);//ABDCBDCB
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;// 1 2
            foo('D');
        }
    }
}

