package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-30 18:29
 */
public class PrimeNumberTest2 {

    public static void main(String[] args) {
        boolean isFalg = true;
        long start = System.currentTimeMillis();

        int count = 0;
        for (int i = 2; i <= 10000; i++) {
            //for (int j = 2; j < i; j++) {

                for(int j=2;j<=Math.sqrt(i);j++){
                if (i % j == 0) {
                    isFalg = false;
                    break;
                }
            }
            if (isFalg == true) {
                System.out.println(i);
                count++;
            }
            isFalg = true;

        }

        long end = System.currentTimeMillis();

        System.out.println("所花费时间：" + (end - start));
        System.out.println("质数的个数为：" + count);

    }

}

/*
优化前：时间：185  个数：1229
优化后：时间：

优化1：时间：32   个数：1229
优化2：时间：20   个数：1229

 */