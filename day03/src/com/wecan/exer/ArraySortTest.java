package com.wecan.exer;

import java.util.Arrays;

/**
 * @author cwk
 * @create 2022-10-19 18:57
 */
public class ArraySortTest {

    public static void main(String[] args) {

        //对10个整数进行按照从小到大的顺序排序
        int[] arr = {3, 5, 64, 2, 34, -53, 75, 124, 43, 64};
        //int[] arr = new int[]{3, 5, 64, 2, 34, -53, 75, 124, 43, 64};

        System.out.println("排序前：" + Arrays.toString(arr));

        //冒泡排序：n个数进行n-1趟排序
        for (int i = 0; i < arr.length - 1; i++) {
            //每趟相邻元素之间的比较次数 - 1
            //原因：因为每趟排序下来，最大的数放在了右边
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
