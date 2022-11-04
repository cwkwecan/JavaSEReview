package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-31 11:37
 *
 * 编一个类A，在类中定义局部类B，B中有一个常量name，有一个方法show()打印常量name。进行测试
 *
 */
public class A {

    class B{
        final String name = "我是B类的name常量";

        public void show(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        A a = new A();

        B b = a.new B();

        b.show();
    }
}
