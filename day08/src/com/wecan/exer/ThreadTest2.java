package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-11-04 11:11
 *
 * 创建多线程的方式二：实现Runnable接口
 * 1、创建一个实现了Runnable接口的类
 * 2、实现类去实现Runnable中的抽象方法：run()
 * 3、创建实现类的对象
 * 4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 *
 *
 */
public class ThreadTest2 implements Runnable{

    //将线程要执行的逻辑声明在run()中
    @Override
    public void run() {
        //遍历100以内的偶数
        for (int i = 0; i < 100; i+=2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        ThreadTest2 tt1 = new ThreadTest2();

        Thread thread1 = new Thread(tt1);

        thread1.setName("线程1");
        thread1.start();//① 启动当前线程 ② 调用当前线程的run() --> 调用了Runnable类型的target的run()

        //再启动一个线程，遍历100以内的偶数
        Thread thread2 = new Thread(tt1);

        thread2.setName("线程2");
        thread2.start();

        //线程1和线程2抢占资源
    }
}
