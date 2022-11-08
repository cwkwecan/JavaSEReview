package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-11-04 21:59
 *
 * 使用同步代码块处理实现Runnable接口的线程安全问题
 *
 */
public class TicketWindowTest2 implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        synchronized (this){//this是当前对象，此处是唯一的
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

        TicketWindowTest2 tw = new TicketWindowTest2();

        Thread t1 = new Thread(tw);
        Thread t2 = new Thread(tw);
        Thread t3 = new Thread(tw);

        t1.setName("窗口1:");
        t2.setName("窗口2:");
        t3.setName("窗口3:");

        t1.start();
        t2.start();
        t3.start();
    }
}
