package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-11-04 22:14
 *
 * 使用同步方法处理继承Thread类的线程安全问题
 * ① 非静态的同步方法，同步监视器是this
 * ② 静态的同步方法，同步监视器是当前类本身 类名.class
 *
 */
public class TicketWindowTest4 extends Thread {

    private static int ticket = 100;

    @Override
    public void run(){
        show();
    }

    private static synchronized void show(){
        //静态同步方法的同步监视器是当前类本身 TicketWindowTest4.class
        //private synchronized void show() {
        // 此时多个线程未共用一把锁，同步监视器是tw1,tw2,tw3，锁不唯一
        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                ticket--;
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) {

        TicketWindowTest4 tw1 = new TicketWindowTest4();
        TicketWindowTest4 tw2 = new TicketWindowTest4();
        TicketWindowTest4 tw3 = new TicketWindowTest4();

        tw1.setName("窗口1:");
        tw2.setName("窗口2:");
        tw3.setName("窗口3:");

        tw1.start();
        tw2.start();
        tw3.start();
    }
}
