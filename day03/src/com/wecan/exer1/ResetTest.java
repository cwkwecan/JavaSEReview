package com.wecan.exer1;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-20 11:17
 */
public class ResetTest {

    public static void main(String[] args) {
        //定义一个4行4列的二维数组，逐个从键盘输入值，将对角线的值清0
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("请输入：");
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    arr[i][j] = 0;
                }else if(i + j == 3){
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("**********对角线元素置零前**********");
        showArray(arr);

        System.out.println("**********对角线元素置零后**********");
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
