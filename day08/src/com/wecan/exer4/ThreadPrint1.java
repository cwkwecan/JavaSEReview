package com.wecan.exer4;

/**
 * 利用多线程设计一个程序，同时输出 50 以内的奇数和偶数，以及当前运行的线程名。
 *
 * 此种方式也行，就是代码较ThreadPrint的方式冗余了
 *
 * @author cwk
 * @create 2022-11-05 21:16
 */
public class ThreadPrint1 implements Runnable {

    int k = 1;

    @Override
    public void run() {
        while (k < 50){
            System.out.println(Thread.currentThread().getName() + "-----" + k);
            k += 2;
        }
        System.out.println(Thread.currentThread().getName() + "------end");
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        ThreadPrint1 m1 = new ThreadPrint1();
        ThreadPrint2 m2 = new ThreadPrint2();


        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

        long end = System.currentTimeMillis();
        System.out.println("花费的时间为" + (end - start));
    }
}

class ThreadPrint2 extends Thread{
    int k = 2;

    @Override
    public void run() {
        while (k < 50){
            System.out.println(Thread.currentThread().getName() + "-----" + k);
            k += 2;
        }
        System.out.println(Thread.currentThread().getName() + "------end");
    }
}
