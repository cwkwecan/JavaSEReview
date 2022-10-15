package com.wecan.exer;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-15 18:02
 */
public class TriNumberSort {

    //实现对三个整数进行排序，输出时按照从小到大的顺序输出。
    // 实现对三个整数进行排序，输出时按照从小到大的顺序输出。
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第1个数：");
        int num1 = scanner.nextInt();
        System.out.print("请输入第2个数：");
        int num2 = scanner.nextInt();
        System.out.print("请输入第2个数：");
        int num3 = scanner.nextInt();

        int[] arr = new int[3];

//        //方式一：借助Arrays工具类
//        for (int i = 0; i < 3; i++) {
//            System.out.print("请输入第" + (i + 1) + "个数：");
//            int num = scanner.nextInt();
//            arr[i] = num;
//        }

        //Arrays.sort()：默认从小到大排序
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));

        //方式二：自写冒泡排序
        //创建当前类的对象（类的实例化）
//        TriNumberSort tns = new TriNumberSort();
//        int[] sortedArr = tns.bubbleSort(arr);
//        //数组默认调用它的toString()方法
////        System.out.println(sortedArr.toString());
//
//        String s = tns.showArr(sortedArr);
//        System.out.println(s);

        //方式三：if-else
        if(num1 > num2){
            if(num1 > num3){
                if(num2 > num3){
                    System.out.println("[" + num3 + "," + num2 + "," + num1 + "]");
                }else{
                    System.out.println("[" + num2 + "," + num3 + "," + num1 + "]");
                }
            }else{
                System.out.println("[" + num2 + "," + num1 + "," + num3 + "]");
            }
        }else{
            if(num2 > num3){
                if(num1 > num3){
                    System.out.println("[" + num3 + "," + num1 + "," + num2 + "]");
                }else{
                    System.out.println("[" + num1 + "," + num3 + "," + num2 + "]");
                }
            }else{
                System.out.println("[" + num1 + "," + num2 + "," + num3 + "]");
            }
        }

    }

    /**
     * 冒泡排序：从小到大排序
     * @param arr
     * @return int[]
     */
    public int[] bubbleSort(int[] arr){
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

    public String showArr(int[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length -1){
                str += arr[i] + ",";
            }else {
                str += arr[i];
            }
        }
        str += "]";
        return str;
    }


}
