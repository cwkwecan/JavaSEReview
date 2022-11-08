package com.wecan.exer7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author cwk
 * @create 2022-11-08 15:06
 */

//1、创建一个实现了Callable接口的实现类
public class ThreadNew implements Callable<Integer> {

    //2、重写Callable接口中的call方法，将要进行的操作声明在call中
    @Override
    public Integer call() throws Exception {
        //遍历100以内的质数
        int cnt = 0;//用来记录质数的个数
        Label:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    continue Label;
                }
            }
            System.out.println(i);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {

        //3、创建实现了Callable接口的实现类的对象
        ThreadNew tn = new ThreadNew();

        //4、将此对象作为参数传递到FutureTask的构造器中，创建FutureTask的对象
        FutureTask<Integer> futureTask = new FutureTask<>(tn);

        //5、将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread thread = new Thread(futureTask);
        thread.start();
        try {

            //6、通过FutureTask的对象调用get()方法，回调实现了Callable接口的实现类中的call方法
            // 来获取call方法中的返回值
            Integer cnt = futureTask.get();
            System.out.println("100以内质数的个数有：" + cnt + "个");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


}
