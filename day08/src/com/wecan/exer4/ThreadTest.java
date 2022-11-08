package com.wecan.exer4;

/**
 *
 * 编写一个继承Thread类的方式实现多线程的程序。该类MyThread有两个属性，
 * 一个字符串WhoAmI代表线程名，一个整数delay代表该线程随机要休眠的时间。
 * 构造有参的构造器，线程执行时，显示线程名和要休眠时间。
 *
 * @author cwk
 * @create 2022-11-05 18:54
 */
class MyThread extends Thread{

    private String whoAmI;//线程名
    private int delay;//整数

    public MyThread(String whoAmI, int delay) {
        this.whoAmI = whoAmI;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello!I am " + whoAmI + ",I sleep " + delay + " milliseconds");
    }
}

public class ThreadTest{

    public static void main(String[] args) {

        MyThread m1 = new MyThread("thread-1", 100);
        MyThread m2 = new MyThread("thread-2", (int) Math.random() * 100);
        MyThread m3 = new MyThread("thread-3", 200);

        m1.start();
        m2.start();
        m3.start();

    }
}

