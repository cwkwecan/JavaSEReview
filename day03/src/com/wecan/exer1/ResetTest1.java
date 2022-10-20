package com.wecan.exer1;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-20 11:18
 */
public class ResetTest1 {

    public static void main(String[] args) {

        //定义一个3行4列的二维数组，逐个从键盘输入值，将左下三角的值清0
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("请输入数据：");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("*************左下三角置零前***************");
        showArray(arr);



        System.out.println("*************左下三角置零后***************");
        showArray(arr);
    }

    public static void showArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
