package com.wecan.exer1;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-16 12:25
 */
public class RightTriangleTest {

    public static void main(String[] args) {
        /*
        2)输入高度，输出直角三角形。如：输入4, 将输出如下图形
        #
        ##
        ###
        ####
         */
        Scanner input = new Scanner(System.in);
        System.out.println("请输入：");
        int len = input.nextInt();
        for (int i = 0; i < len; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();

        /*
        3)输入高度，输出倒直角三角形。如：输入4, 将输出如下图形
        ####
        ###
        ##
        #
         */
        System.out.println("请输入：");
        int height = input.nextInt();
        for (int i = 0; i < height; i++) {
            for(int j = height - i;j > 0;j--){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
