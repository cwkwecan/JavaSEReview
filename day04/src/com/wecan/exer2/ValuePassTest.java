package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 11:56
 */
public class ValuePassTest {

    public static void main(String[] args) {

        System.out.println("**********基本数据类型************");
        int m = 10;
        int n = m;
        System.out.println("m = " + m + ",n = " + n);//m=10,n=10

        n = 20;
        System.out.println("m = " + m + ",n = " + n);//m=10,n=20

        System.out.println("***********引用数据类型*************");

        Order o1 = new Order();
        o1.orderId = 1001;

        Order o2 = o1;//赋值以后，o1和o2的地址指相同，都指向了堆空间中同一个对象实体

        System.out.println("o.orderId = " + o1.orderId + ",o2.orderId = " + o2.orderId);

        o2.orderId = 1002;

        System.out.println("o.orderId = " + o1.orderId + ",o2.orderId = " + o2.orderId);
    }
}
