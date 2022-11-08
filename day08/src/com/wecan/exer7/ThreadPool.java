package com.wecan.exer7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cwk
 * @create 2022-11-08 15:59
 */
public class ThreadPool {

    public static void main(String[] args) {

        //1、提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        //2、执行指定的线程的操作。需要提供实现了Runnable接口或Callable接口的实现类的对象
        //2.1 service.execute(Runnable runnable)：适合使用Runnable
        service.execute(new Runnable() {
            @Override
            public void run() {
                //遍历100以内的偶数
                for (int i = 0; i < 100; i+=2) {
                    System.out.println(i);
                }
                System.out.println("100以内偶数打印完毕！");
            }
        });
        //2.2 service.submit(Callable callable)：适合使用Callable
        try {
            Integer factor = service.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    //计算10的阶乘
                    int fact = 1;
                    for (int i = 1; i <= 10; i++) {
                        fact *= i;
                    }
                    return fact;
                }
            }).get();
            System.out.println("10!=" + factor);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        //3.关闭连接池
        service.shutdown();
    }
}
