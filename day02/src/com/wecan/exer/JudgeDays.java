package com.wecan.exer;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-15 19:26
 */
public class JudgeDays {

    public static void main(String[] args) {

        //从键盘分别输入年、月、日，判断这一天是当年的第几天
        Scanner scanner = new Scanner(System.in);

        System.out.print("年：");
        int year = scanner.nextInt();

        System.out.print("月：");
        int month = scanner.nextInt();

        System.out.print("日：");
        int day = scanner.nextInt();

        int days = day;

        switch (month){
            case 12://走到12，说明days已经走过了2~11月，倒着来简单
                //days = days(12月的天数) + 11月的天数
                days += 30;//11月
            case 11:
                days += 31;//10月
            case 10:
                days += 30;//9月
            case 9:
                days += 31;//8月
            case 8:
                days += 31;//7月
            case 7:
                days += 30;//6月
            case 6:
                days += 31;//5月
            case 5:
                days += 30;//4月
            case 4:
                days += 31;//3月
            case 3:
                days += 28;//2月
                //判断是否为闰年
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    days++;//闰年29天
                }
            case 2:
                days += 31;//1月
        }
        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + days + "天");
    }
}
