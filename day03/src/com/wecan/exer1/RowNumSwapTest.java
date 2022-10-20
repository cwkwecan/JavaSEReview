package com.wecan.exer1;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-19 21:58
 */
public class RowNumSwapTest {

    public static void main(String[] args) {

        //定义一个4行4列的二维数组，逐个从键盘输入值，
        // 然后将第1行和第4行的数据进行交换，将第2行和第3行的数据进行交换
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("请输入第" + (i + 1) + "行，第" + (j + 1) + "列的数据：");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("***************交换前******************");
        showArray(arr);

        //交换数组的第1行和第4行，第2行和第3行
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == 0){
                    int temp = arr[i][j];
                    arr[i][j] = arr[3][j];
                    arr[3][j] = temp;
                }else if(i == 1){
                    int temp = arr[i][j];
                    arr[i][j] = arr[2][j];
                    arr[2][j] = temp;
                }
            }
        }

        System.out.println("***************交换后******************");
        showArray(arr);

    }

    public static void showArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("第" + (i + 1) + "行:\t");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
