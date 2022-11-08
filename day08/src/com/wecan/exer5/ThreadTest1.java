package com.wecan.exer5;

/**
 * @author cwk
 * @create 2022-11-07 15:40
 *
 * 模拟一个人生产50个玩具，每200毫秒生产一个，
 * 当生产到第20个时加入每秒吃1个馒头，共吃完3个后在接着生产的多线程。
 *
 */
public class ThreadTest1 {

    public static void main(String[] args) {

        EatMantou eatMantou = new EatMantou();
        eatMantou.setName("人");

        for (int i = 1; i <= 50; i++) {
            System.out.println("人" + " 正在生产第" + i + "个玩具...");
            try {
                //休眠200毫秒
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == 20){
                eatMantou.start();
                try {
                    eatMantou.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


//创建一个继承于Thread类的子类()
class EatMantou extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=3 ; i++) {
            System.out.println(Thread.currentThread().getName() + " 正在吃第" + i + "个馒头...");
            //休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
