package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-11-04 17:12
 */
public class SellTicketTest01 implements Runnable{

    private int ticket = 100;//100张票

    @Override
    public void run() {
        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        SellTicketTest01 st = new SellTicketTest01();

        Thread win1 = new Thread(st);
        Thread win2 = new Thread(st);
        Thread win3 = new Thread(st);

        win1.setName("窗口1");
        win2.setName("窗口2");
        win3.setName("窗口3");

        win1.start();
        win2.start();
        win3.start();

    }
}
