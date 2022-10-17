package com.wecan.exer;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-15 22:42
 */
public class JudgeIsOrNotLeapYear {

    public static void main(String[] args) {

        /*
        编写程序，判断给定的某个年份是否是闰年
        闰年的判断规则如下：
        （1）若某个年份能被4整除但不能被100整除，则是闰年。
        （2）若某个年份能被400整除，则也是闰年。
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份");
        int year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "不是闰年");
        }

    }


}
