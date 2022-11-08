package com.wecan.exer5;

/**
 * @author cwk
 * @create 2022-11-07 16:17
 *
 * 编写龟兔赛跑多线程程序，设赛跑长度为100米，每跑完10米输出一次结果。
 * 改进上题的龟兔赛跑程序，通过改变优先级，并减掉休眠时间，使得乌龟以迅雷不及掩耳的速度跑完100米。
 *
 */
public class ThreadTest2 {

    public static void main(String[] args) {

        Race tortoise = new Race();
        Race rabbit = new Race();

        tortoise.setName("乌龟");
        rabbit.setName("兔子");

        /*
        该程序运行后的结果（多运行几次），能充分说明：
            高优先级的线程要抢占低优先级线程cpu的执行权。但是只是从概率上讲，高优先级的线程高概率的情况下被执行。
            并不意味着只有当高优先级的线程被执行完后，低优先级的线程才执行。
         */
        tortoise.setPriority(Thread.MAX_PRIORITY);
        rabbit.setPriority(Thread.MIN_PRIORITY);

        tortoise.start();
        rabbit.start();

    }
}

class Race extends Thread{

    private int len = 0;

    @Override
    public void run() {
        while(true){
            len++;
            if(len > 0 && len % 10 == 0){
                System.out.println(Thread.currentThread().getName() + " 已经跑完" + len
                        + "米" + " 还剩余" + (100 - len) + "米");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
            if(len == 100){
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + "跑完了, yeah!");
    }
}
