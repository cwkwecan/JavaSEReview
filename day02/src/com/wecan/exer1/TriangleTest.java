package com.wecan.exer1;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-16 12:21
 */
public class TriangleTest {

    public static void main(String[] args) {

        /*
        1)输入长和宽，输出长方形，如：输入4和3, 将输出如下图形
        ####
        ####
        ####
         */
        Scanner input = new Scanner(System.in);
        System.out.println("请输入长：");
        int length = input.nextInt();
        System.out.println("请输入宽：");
        int width = input.nextInt();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
