package com.wecan.exer1;

import org.junit.Test;

/**
 * @author cwk
 * @create 2022-10-16 12:46
 */
public class RopeTest {

    public static void main(String[] args) {

        /*
        3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。
         */
        int days = 0;
        for (int i = 3000; i >=5 ; i /= 2) {
            days++;
        }
        System.out.println(days);

        System.out.println();

        int days1 = 0;
        for(int i = 3000;i >= 5;days1++){
            i /= 2;
        }
        System.out.println(days1);
    }

    @Test
    public void test1(){
        //打印1-100之间非13的倍数，使用continue语句
        for (int i = 1; i < 100; i++) {
            if(i % 13 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

    //用循环控制语句打印输出：1+3+5+...+99=?的结果
    @Test
    public void test2(){
        int sum = 0;
        for(int i = 1;i <= 99;i += 2){
            sum += i;
        }
        System.out.println(sum);

        System.out.println();

        sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
