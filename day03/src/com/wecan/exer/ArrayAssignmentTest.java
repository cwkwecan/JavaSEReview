package com.wecan.exer;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-19 17:08
 */
public class ArrayAssignmentTest {

    public static void main(String[] args) {

      /*  练习：
        1、从键盘输入本组学员的成绩，放到数组中
        2、用for循环显示所有学员的成绩
        3、排序：从低到高
        4、查找是否有正好60分的，如果有返回位置
        5、复制成绩最低三名构成新数组
        6、用工具类打印成绩最低三名成绩
        */
        Scanner input = new Scanner(System.in);

        int[] scoresArr = new int[5];
        //1.录入成绩
        for (int i = 0; i < scoresArr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "学员的成绩：");
            scoresArr[i] = input.nextInt();
        }

        //2.输出成绩
        for (int i = 0; i < scoresArr.length; i++) {
            System.out.print(scoresArr[i] + "\t");
        }

        //3.成绩排序（冒泡排序）
        for (int i = 0; i < scoresArr.length - 1; i++) {
            for (int j = 0; j < scoresArr.length - 1 - i; j++) {
                if(scoresArr[j] > scoresArr[j + 1]){
                    int temp = scoresArr[j];
                    scoresArr[j] = scoresArr[j + 1];
                    scoresArr[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("************************");

        //4.成绩低到高排序后
        for (int i = 0; i < scoresArr.length; i++) {
            System.out.print(scoresArr[i] + "\t");
        }

        System.out.println();

        //5.查找是否正好有60分的，如果有返回位置
        for (int i = 0; i < scoresArr.length; i++) {
            if(scoresArr[i] == 60){
                System.out.println("60分的学员所以位置为：" + i);
                break;
            }else{
                System.out.println("未找到");
            }
        }

        //6.复制成绩最低三名构成新数组
        int[] scores = new int[3];
        for (int i = 0; i < 3; i++) {
            scores[i] = scoresArr[i];
        }

        //7.用工具类打印成绩最低三名成绩
        System.out.println(Arrays.toString(scores));

    }

    @Test
    public void test1(){
        //数组赋值练习1
        //创建一个char类型的26个元素的数组，分别 放置'A'-'Z'。
        //使用for循环访问所有元素并打印出来。

        char[] letters = new char[26];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char)('A' + i);
        }

        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + "\t");
        }
    }

    @Test
    public void test2(){
        //数组赋值练习2
        //创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z',   后10个元素放置'0'-'9'。
        //使用for循环访问所有元素并打印出来。
        //提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1'
        char[] arr = new char[36];
        for (int i = 0; i < arr.length; i++) {
            if(i < 26){
                arr[i] = (char)('A' + i);
            }else{
                arr[i] = (char)(i + 22);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    @Test
    public void test3(){

        int[] arr = {34, 4, 54, 221, -34, 43};

        //foreach：增强for循环
        for(int i : arr){
            System.out.println(i);
        }

        System.out.println("****************");

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("******************");

        //复制数组中最低小的三个元素构成新数组
        int[] newArr = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(newArr));
        System.out.println("*******************");
        int[] newArr1 = Arrays.copyOfRange(arr, 0, 3);
        System.out.println(Arrays.toString(newArr1));
    }
}
