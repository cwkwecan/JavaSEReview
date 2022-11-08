package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-11-05 19:23
 *
 * 利用多线程设计一个程序，同时输出 50 以内的奇数和偶数，以及当前运行的线程名。
 *
 */
public class ThreadPrint extends Thread {
    int k = 1;

    public void run() {
        int i = k;
        while (i < 50) {
            System.out.println(Thread.currentThread().getName() + "-----" + i);
            i += 2;
        }
        System.out.println(Thread.currentThread().getName() + " end!");
    }

    public static void main(String[] args) {
        //创建了两个对象（线程），每个对象（线程）独立的拥有一套类的非静态（static）属性
        ThreadPrint t1 = new ThreadPrint();
        ThreadPrint t2 = new ThreadPrint();

        t1.k = 1;//通过对象.属性的方式将k的值更改为1
        t2.k = 2;

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
