package com.wecan.exer3;

/**
 * Java笔试题：
 *      给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为
 *  目标值target相等的两个整数，并返回它们的数组下标
 *  例如：nums:[1,2,3,4,5]  target:7   返回下标数组：[1,4]
 *
 * @author cwk
 * @create 2022-11-05 12:53
 */
public class FindNumberTest {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int target = 7;

        //程序走4轮
        //i 取值：0,1,2,3
        //j 取值：0,1,2,3
        //分析动与不动的变量
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i,k = i + 1; k < nums.length;k++) {
                if(nums[j] + nums[k] == target){
                    System.out.println("[" + i + "," + k + "]");
                }
            }
        }
    }
}
