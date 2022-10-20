package com.wecan.exer;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author cwk
 * @create 2022-10-19 18:27
 */
public class ReverseArrayTest {

    //逆序数组元素
    @Test
    public void test1(){
        int[] arr = {(int) (Math.random() * 1000), (int) (Math.random() * 1000),
                (int) (Math.random() * 1000), (int) (Math.random() * 1000),
                (int)(Math.random() * 1000)};
        System.out.println(Arrays.toString(arr));

        System.out.println("***************************");
        reverseArr(arr);

        System.out.println(Arrays.toString(arr));

    }

    public void reverseArr(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }
}
