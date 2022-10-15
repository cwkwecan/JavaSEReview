package com.wecan.exer;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-15 19:18
 */
public class PrintWeekNum {
    public static void main(String[] args) {
        //编写程序，从键盘接收整数参数。如果该数为1-7，打印对应的星期值，否则打印“非法参数”。
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入(1-7)：");
        int week = scanner.nextInt();
        //方式一：if-else if-else
        if (week == 1) {
            System.out.println("星期一");
        } else if (week == 2) {
            System.out.println("星期二");
        } else if (week == 3) {
            System.out.println("星期三");
        } else if (week == 4) {
            System.out.println("星期四");
        } else if (week == 5) {
            System.out.println("星期五");
        } else if (week == 6) {
            System.out.println("星期六");
        } else if (week == 7) {
            System.out.println("星期天");
        } else {
            System.out.println("非法参数");
        }

        System.out.println("***************************");

        //方式二：switch-case
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            default:
                System.out.println("非法参数");
                break;
        }

    }


}
