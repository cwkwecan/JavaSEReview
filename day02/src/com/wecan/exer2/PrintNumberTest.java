package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-16 17:27
 */
public class PrintNumberTest {

    public static void main(String[] args) {
        //打印1-100之间数，其中3、5、7的倍数不打印（continue）
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
