package com.wecan.exer1;

import org.junit.Test;

/**
 * @author cwk
 * @create 2022-10-16 12:05
 */

public class QuestionTest {
    
    @Test
    public void test1(){
        for (int i = 1; i < 100; i++) {
            if(i % 13 == 0){
                System.out.println(i);
            }
        }
    }

    @Test
    public void test2(){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void test3(){
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("1000以内偶数和为：" + sum);
    }

    @Test
    public void test4(){
        int i=10;
        while(i>0){
            i = i +1;
            if(i==10){
                break;
            }
        }
        System.out.println("i=" + i);
    }

    @Test
    public void test5(){
        int n=10;
        for (int i = 0; -i < n; i--) {
            System.out.println("=");
        }
    }

}
