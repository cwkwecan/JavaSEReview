package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-11-04 17:36
 */
public class SellTicketTest02 extends Thread {

    private static int ticket = 100;//票数

    @Override
    public void run() {
        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                ticket--;
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) {

        SellTicketTest02 st1 = new SellTicketTest02();
        st1.setName("窗口1");
        st1.start();

        SellTicketTest02 st2 = new SellTicketTest02();
        st2.setName("窗口2");
        st2.start();

        SellTicketTest02 st3 = new SellTicketTest02();
        st3.setName("窗口3");
        st3.start();
    }
}
