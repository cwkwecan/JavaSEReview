package com.wecan.exer;

import java.util.Arrays;

/**
 * @author cwk
 * @create 2022-10-19 20:59
 */
public class ReverseArrayTest1 {

    public static void main(String[] args) {

        //将一个数组逆序输出。
        //<提示>程序分析：用第一个与最后一个交换。
        int[] arr = {32, 4, 53, 6, -21, 42, 67, 75, 21, 88};
        System.out.println("反转前：" + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("反转后：" + Arrays.toString(arr));

    }
}
