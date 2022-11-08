package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-11-04 10:26
 *
 * 多线程的创建，方式一：继承于Thread类
 *
 */

//1、创建一个继承于Thread类的子类
public class ThreadTest1 extends Thread{

    //2、重写Thread类的run() --> 将此线程执行的操作声明在run()中


    @Override
    public void run() {
        //遍历100以内的所有偶数
        for (int i = 0; i < 100; i+=2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }


    public static void main(String[] args) {
        //3、创建Thread类的子类的对象
        ThreadTest1 tt1 = new ThreadTest1();

        //4、通过此对象调用start()
        // ① 启动当前线程 ② 调用当前线程的run()
        tt1.start();

        //再启动一个线程，遍历100以内的偶数。不可以还让已经start()的线程去执行。
        // 会报IllegalThreadStateException
//        t1.start();
        //我们需要重新创建一个线程的对象
//        ThreadTest1 tt2 = new ThreadTest1();
//        tt2.start();

        for (int i = 0; i < 100; i+=2) {
            System.out.println(Thread.currentThread().getName() + ":" + i + "*********main()*********");
        }
    }
}
