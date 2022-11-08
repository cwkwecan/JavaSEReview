package com.wecan.exer7;

/**
 * @author cwk
 * @create 2022-11-08 15:43
 */
public class PrimeNumberOptimizeTest {

    public static void main(String[] args) {

        //        boolean isFlag = true;
//        for (int i = 2; i < 100; i++) {
//            for (int j = 2; j < i; j++) {
//                if(i % j == 0){
//                    isFlag = false;
//                    break;
//                }
//            }
//            //isFlag是true，表明i未被除1和本身之外的数除尽，即此时的i是质数
//            //若isFlag是false，表明i不是质数，后应将isFlag的值更改为true，再继续下一次循环
//            if(isFlag){
//                System.out.println(i);
//            }
//            isFlag = true;
//        }
//        boolean isFlag = true;
//        int cnt = 0;//用来记录质数的个数
//        for (int i = 2; i < 100; i++) {
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if(i % j == 0){
//                    isFlag = false;
//                    break;
//                }
//            }
//            if(isFlag){
//                cnt++;
//            }
//            isFlag = true;
//        }
//        System.out.println(cnt);

        int cnt = 0;
        Label:
        for (int i = 2; i < 100; i++) {
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    continue Label;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
