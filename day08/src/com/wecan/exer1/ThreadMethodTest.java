package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-11-04 14:27
 */
public class ThreadMethodTest {

    public static void main(String[] args) {

        Thread3 t = new Thread3();
        t.setName("线程1");
        t.start();

        Thread.currentThread().setName("主线程");

        for (int i = 0; i < 100; i+=2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);

            if(i == 20){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        boolean isLive = t.isAlive();
        System.out.println(isLive);
    }
}


class Thread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){

                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

//            if(i % 20 == 0){
//                yield();//释放当前cpu的执行权
//            }

        }

    }
}