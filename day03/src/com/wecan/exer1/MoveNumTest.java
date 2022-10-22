package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-19 21:53
 */
public class MoveNumTest {

    public static void main(String[] args) {

        //有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("***********移动前*************");
        showArr(arr);

        System.out.println("***********移动后*************");
        int[] arr1 = arrMove(arr, 3);
        showArr(arr1);
    }

    public static void showArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.print("]\n");
    }

    public static int[] arrMove(int[] arr,int movNum){
        int[] newArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i < movNum){
                newArr[i] = arr[arr.length - movNum + i];
            }else{
                newArr[i] = arr[count++];
            }
        }
        return newArr;
    }
}
