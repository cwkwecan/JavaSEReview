package com.wecan.exer2;

import java.util.Arrays;

/**
 * @author cwk
 * @create 2022-10-22 22:40
 */
public class ValuePassExer2 {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 7};

        //调用sort方法，实现从大到小排序
        //在此处补充代码
        ValuePassExer2 vpe = new ValuePassExer2();
        vpe.sort(array);

        //显示结果
        System.out.println("排序后的结果是：" + Arrays.toString(array));
    }

    //要求使用冒泡排序完成
    public void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

}
