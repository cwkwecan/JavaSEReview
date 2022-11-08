package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-11-04 12:11
 */
public class ThreadExer1 {

    //练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        t1.setName("线程1");
        t1.start();

        Thread2 t2 = new Thread2();
        Thread th2 = new Thread(t2);
        th2.setName("线程2");
        th2.start();
    }

}

//方式1：继承Thread类
class Thread1 extends Thread{
    @Override
    public void run(){
        //遍历100以内的偶数
        for (int i = 0; i < 100; i+=2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        //遍历100以内的奇数
        for (int i = 1; i < 100; i+=2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
