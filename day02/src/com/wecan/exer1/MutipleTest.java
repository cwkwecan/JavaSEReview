package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-16 12:33
 */
public class MutipleTest {

    public static void main(String[] args) {
        //打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }

}
