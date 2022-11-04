package com.wecan.exer5;

/**
 * @author cwk
 * @create 2022-10-31 12:36
 */
public class CellphoneTest {

    public static void main(String[] args) {

        Cellphone cp = new Cellphone();
        cp.alarmclock(new Bell() {
            @Override
            public void sound() {
                System.out.println("懒猪起床了");
            }
        });
    }
}
