package com.wecan.exer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-19 21:08
 */
public class SwapTest {

    public static void main(String[] args) {

        //输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。

        int[] arr = new int[6];
        Scanner input = new Scanner(System.in);

        int max = arr[0];
        int maxIndex = 0;
        int min = arr[0];
        int minIndex = arr.length - 1;
        //1.给数组添加元素，顺便找出数组中最大最小的元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print("正在给数组添加第" + (i + 1) + "个元素：");
            arr[i] = input.nextInt();
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("数组中最大的元素是：" + max);
        System.out.println("数组中最小的元素是：" + min);

        System.out.println("处理前：" + Arrays.toString(arr));

        //2.将最大的与第一个交换，最小的与最后一个交换
        int temp = arr[0];
        arr[0] = arr[maxIndex];
        arr[maxIndex] = temp;

        int temp1 = arr[arr.length - 1];
        arr[arr.length - 1] = arr[minIndex];
        arr[minIndex] = temp1;

        System.out.println("*****************************");

        //3.输出数组
        System.out.println("处理后：" + Arrays.toString(arr));
    }
}
