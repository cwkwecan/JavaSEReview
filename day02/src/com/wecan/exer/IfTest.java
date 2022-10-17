package com.wecan.exer;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-15 22:50
 */
public class IfTest {

    public static void main(String[] args) {
        //要求用户输入两个数a和b，如果a能被b整除或者a加b大于1000，则输出a；否则输出b。
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入a的值：");
        int a = scanner.nextInt();
        System.out.print("请输入b的值：");
        int b = scanner.nextInt();
        if(a % b == 0 || (a + b) > 1000){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

}
