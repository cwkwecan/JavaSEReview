package com.wecan.exer;

import java.util.Arrays;

/**
 * @author cwk
 * @create 2022-10-19 19:15
 */
public class FibonacciTest {

    public static void main(String[] args) {

        //用数组求出斐波那契数列的前20项值
        //斐波那契数列：从第3项开始，每一项都等于前两项之和

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 || i == 1){
                arr[i] = 1;
            }else{
                arr[i] = arr[i - 2] + arr[i - 1];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
