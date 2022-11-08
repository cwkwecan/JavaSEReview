package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-11-05 19:10
 *
 * 在{1}添加什么代码，可以保证如下代码输出100
 *
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread1 m = new MyThread1();
        Thread t = new Thread(m);
        t.start();

        /*
        {1}
         */
        try {
            //join()：线程的插队。插队的线程一旦插队成功，则肯定先执行完插入的线程所有的任务

            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //未加入代码 t.join()代码前，分析输出0原因
        //终端输入jsconsole后易知，主线程先于分线程执行完，此时i的默认初始化值为0，
        // 还未来的及给i赋值100（因为分线程还未执行完毕，i的值没来的及被更改为100主线程就把i的值输出了）

        // {1}处所填代码方式2
        //注意：该方式不能完全保证输出100，具体情况具体分析
        //t.join()一定能保证输出100
//        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        int j = m.i;
        System.out.println(j);
    }

}

class MyThread1 implements Runnable{
    int i;
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " --------->end");
        i=100;
    }

}
