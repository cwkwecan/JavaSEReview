package com.wecan.exer1;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-20 12:04
 */
public class FindMaxTest {

    public static void main(String[] args) {

        //定义一个N*N二维数组，从键盘上输入值，找出每行中最大值组成一个一维数组并输出
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[4][4];
        //提前造一个一维数组
        int[] arr1 = new int[4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("请输入第" + (i + 1) + "行，第" + (j + 1) + "列的数据：");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("***************原数组****************");
        showArray(arr);

        for (int i = 0; i < arr.length; i++) {
            int rowMax = arr[i][0];//假设每一行的第1个元素最大
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > rowMax){
                    rowMax = arr[i][j];
                }
            }
            arr1[i] = rowMax;//将该行最大的元素保存到一维数组中
        }

        System.out.println("**************一维数组****************");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

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
