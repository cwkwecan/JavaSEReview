package com.wecan;

/**
 * @author cwk
 * @create 2022-10-12 12:23
 */
public class Exer1Test {

    //为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
    public static void main(String[] args) {

        int day = 89 / 24;
        int hour = 89 % 24;
        System.out.println("共" + day + "天，共" + hour + "小时");
    }

}

class Exer2Test{

    public static void main(String[] args) {

        //今天是周二，100天以后是周几？
        int week = 2;
        week += 100;
        week = week % 7;
        System.out.println("100天后星期" + week);
    }

}