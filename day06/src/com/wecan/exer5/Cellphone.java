package com.wecan.exer5;

/**
 * @author cwk
 * @create 2022-10-31 12:06
 *
 * 有一个铃声接口类Bell，有一个方法sound，有一个手机类Cellphone，具有闹钟功能alarmclock，
 * 参数是Bell类型，测试手机类的闹钟功能，通过匿名内部类作为参数，打印：懒猪起床了。
 *
 */
public class Cellphone {


    public void alarmclock(Bell bell){
        bell.sound();
    }
}
