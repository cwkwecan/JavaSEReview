package com.wecan.exer3;

/**
 * 给定一个数组arr，手写一个冒泡排序
 *
 * @author cwk
 * @create 2022-11-05 13:08
 */
public class BubbleSortTest {

    public static void main(String[] args) {

        int[] arr = new int[]{42,2,4,15,-6,23,34,65,554,-82};
        System.out.println("排序前：");
        BubbleSortTest.showArray(arr);

        BubbleSortTest.bubbleSort(arr);

        System.out.println("排序后：");
        BubbleSortTest.showArray(arr);


    }

    /**
     * 冒泡排序，从小到大
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


    public static void showArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1){
                System.out.print(arr[i] + ", ");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

}
