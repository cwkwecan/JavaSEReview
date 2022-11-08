package com.wecan.exer5;

/**
 * @author cwk
 * @create 2022-11-07 19:35
 *
 * 现在有T1、T2、T3三个线程，怎样保证T2在T1执行完后执行，T3在T2执行完后执行
 *
 */
public class ThreadTest4 {

    public static void main(String[] args) throws InterruptedException {

        T t1 = new T("T1");
        T t2 = new T("T2");
        T t3 = new T("T3");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();


    }
}

class T extends Thread{

    private String threadName;

    public T(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(threadName + "第" + i + "次");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}