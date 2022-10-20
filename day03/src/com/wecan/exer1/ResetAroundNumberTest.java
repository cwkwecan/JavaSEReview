package com.wecan.exer1;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-19 22:30
 */
public class ResetAroundNumberTest {

    public static void main(String[] args) {

        //定义一个3行4列的二维数组，逐个从键盘输入值，编写程序将四周的数据清0
        int[][] arr = new int[3][4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("请输入：");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("**************置零前*****************");
        showArray(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length - 1) {
                    arr[i][j] = 0;
                } else if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("**************置零后*****************");
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
