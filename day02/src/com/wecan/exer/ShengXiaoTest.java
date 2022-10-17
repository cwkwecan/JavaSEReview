package com.wecan.exer;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-16 17:03
 */
public class ShengXiaoTest {

    public static void main(String[] args) {

        /*
        编写一个程序，为一个给定的年份找出其对应的中国生肖。
        中国的生肖基于12年一个周期，每年用一个动物代表：
            rat（鼠）、ox（牛）、tiger（虎）、rabbit（兔）、dragon（龙）、snake（蛇）、
            horse（马）、sheep（羊）、monkey（候）、rooster（鸡）、dog（狗）、pig（猪）。
        提示：2019年：猪   2019 % 12 == 3
         */
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();
        switch (year % 12){
            case 0:
                System.out.println(year + "是猴(monkey)年");
                break;
            case 1:
                System.out.println(year + "是狗(dog)年");
                break;
            case 3:
                System.out.println(year + "是猪(pig)年");
                break;
            case 4:
                System.out.println(year + "是鼠(rat)年");
                break;
            case 5:
                System.out.println(year + "是牛(ox)年");
                break;
            case 6:
                System.out.println(year + "是虎(tiger)年");
                break;
            case 7:
                System.out.println(year + "是兔(rabbit)年");
                break;
            case 8:
                System.out.println(year + "是龙(dragon)年");
                break;
            case 9:
                System.out.println(year + "是蛇(snake)年");
                break;
            case 10:
                System.out.println(year + "是马(horse)年");
                break;
            case 11:
                System.out.println(year + "是羊(sheep)年");
                break;
        }
    }
}
