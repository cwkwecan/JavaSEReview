package com.wecan.exer5;

/**
 * @author cwk
 * @create 2022-11-07 16:56
 *
 * 多线程操作(50分)
 * 1)启动两个线程对一个数字i操作（10分）
 * 2)其中1个线程每次对i加1（10分）
 * 3)另1个线程每次对i减1（10分）
 * 4)各运行20次，结果i的值等于初始值。（20分）
 *
 */
public class ThreadTest3 {

    private static int i = 6;

    public static void main(String[] args) {
        ThreadTest3 tt = new ThreadTest3();
        T1 t1 = tt.new T1("T1线程");
        T2 t2 = tt.new T2("T2线程");

        t1.start();
        t2.start();
    }

    class T1 extends Thread{

        public T1(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int j = 0; j < 20; j++) {
                System.out.println(Thread.currentThread().getName() + "对i加1,i=" + (++i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class T2 extends Thread{

        public T2(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int j = 0; j < 20; j++) {
                System.out.println(Thread.currentThread().getName() + "对i减1,i=" + (--i));
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

