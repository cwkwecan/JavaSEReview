package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-11-04 21:42
 *
 * 同步代码块处理继承Thread类的线程安全问题
 *
 */
public class TicketWindowTest1 extends Thread {

    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run(){
        //锁可以为任何类的对象
        synchronized (obj){//括号内为同步监视器，俗称锁，多个线程共用一把锁
            while(true){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        TicketWindowTest1 tw1 = new TicketWindowTest1();
        tw1.setName("窗口1:");
        tw1.start();

        TicketWindowTest1 tw2 = new TicketWindowTest1();
        tw2.setName("窗口2:");
        tw2.start();

        TicketWindowTest1 tw3 = new TicketWindowTest1();
        tw3.setName("窗口1:");
        tw3.start();
    }
}


