package com.wecan.exer3;

/**
 * @author cwk
 * @create 2022-11-05 11:23
 */
class Number implements Runnable{

    private int number = 1;
    private Object obj = new Object();

    @Override
    public void run() {

        while(true){

            synchronized (obj) {

                //唤醒阻塞的线程
                obj.notify();//this.notify()

                if(number <= 100){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //使得调用如下wait()方法的线程进入阻塞状态
                        obj.wait();//this.wait()
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else{
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {

    public static void main(String[] args) {

        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        Thread t3 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");

        t1.start();
        t2.start();
        t3.start();

    }
}
