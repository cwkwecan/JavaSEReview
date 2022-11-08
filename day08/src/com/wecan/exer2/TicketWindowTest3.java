package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-11-04 22:07
 *
 * 使用同步方法处理实线Runnable接口的线程安全问题
 * ① 非静态的同步方法，同步监视器是this
 * ② 静态的同步方法，同步监视器是当前类本身 类名.class
 *
 */
public class TicketWindowTest3 implements Runnable{

    private int ticket = 100;

    @Override
    public void run(){
        show();
    }

    private synchronized void show() {//同步监视器是this
        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        TicketWindowTest3 tw = new TicketWindowTest3();

        Thread t1 = new Thread(tw);
        Thread t2 = new Thread(tw);
        Thread t3= new Thread(tw);

        t1.setName("窗口1:");
        t2.setName("窗口2:");
        t3.setName("窗口3:");

        t1.start();
        t2.start();
        t3.start();
    }

}
