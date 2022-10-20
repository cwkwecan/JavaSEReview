package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-19 19:07
 */
public class JuZhenTest {

    public static void main(String[] args) {

        //求一个3*3矩阵对角线元素之和
        //<提示>
        //程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。

        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    sum += arr[i][i];
                }
            }
        }
        System.out.println("3*3矩阵对角线元素之和为：" + sum);
    }
}
