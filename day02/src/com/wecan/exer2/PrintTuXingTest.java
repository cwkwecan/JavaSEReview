package com.wecan.exer2;

import org.junit.Test;

/**
 * @author cwk
 * @create 2022-10-16 18:00
 */
public class PrintTuXingTest {

    @Test
    public void testPrintTriangle() {
        /*

         *
         * * *
         * * * * *
         * * * * * * *
         * * * * *
         * * *
         *

         */
//        for (int i = 0; i < 7; i++) {
//            if (i < 4) {
//                for (int j = 0; j < 2 * i + 1; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            } else {
//                for (int k = 0; k < 13 - 2 * i; k++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0;j < 2 * i + 1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 3;i > 0;i--){
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    @Test
    public void testPrintDiamond(){
        /*
        打印如下的图形：菱形1
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
         */
        for (int i = 0; i < 9; i++) {
            if(i < 5){
                for (int j = 0; j < 4 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for (int j = 0;j < i - 4;j++){
                    System.out.print(" ");
                }
                for(int k = 0;k < 9 - i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    /*
    打印如下的图形：菱形2
    **********
    ****  ****
    ***    ***
    **      **
    *        *
    **      **
    ***    ***
    ****  ****
    **********
     */
    @Test
    public void testPrintDiamond1(){
        for (int i = 0; i < 9; i++) {
            if(i == 0 || i == 8){
                System.out.println("**********");
            }else if(i == 1 || i == 7){
                System.out.println("****  ****");
            }else if(i == 2 || i == 6){
                System.out.println("***    ***");
            }else if(i == 3 || i == 5){
                System.out.println("**      **");
            }else{
                System.out.println("*        *");
            }
        }
    }
}
