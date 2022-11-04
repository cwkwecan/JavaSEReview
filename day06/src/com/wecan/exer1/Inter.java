package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-30 17:27
 */
public interface Inter {
    //public abstract void show(int a,int b)
    void show(int a,int b);

    //public abstract void func()
    void func();
}

class Demo{
    public static void main(String[] args) {

        //补足代码，调用两个函数，要求用匿名内部类
        Inter inter = new Inter() {
            @Override
            public void show(int a, int b) {

            }

            @Override
            public void func() {

            }
        };
    }
}
