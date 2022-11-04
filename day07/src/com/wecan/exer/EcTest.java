package com.wecan.exer;

import org.junit.Test;

/**
 * @author cwk
 * @create 2022-11-03 18:45
 */
public class EcTest {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 1, 1, 1};
            for (int i = 0; i < 5; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("这是一个异常,不是错误");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    //测试空指针异常
    @Test
    public void testNullPointerException(){
//        String str = "abc";
//        str = null;
//        System.out.println(str.equals("abc"));

//        int[] arr = null;
//        System.out.println(arr[0]);

        String str1 = "abc";
        str1 = null;
        System.out.println(str1.charAt(0));

    }

    //测试类转换异常
    @Test
    public void testClassCastException(){

        Animal a1 = new Dog();//父类的引用指向子类的对象

        Animal a2 = new Cat();//父类的引用指向子类的对象

        Dog dog = (Dog)a1;//向下转型（强制类型转换）

        Dog dog1 = (Dog)a2;//将猫的实例赋给Dog类型，编译可通过，运行报异常

    }

    //测试数组角标越界异常
    @Test
    public void testArrayIndexOutOfBoundsException(){
        double[] arr = new double[5];//默认值为0.0

        System.out.println(arr[5]);
    }

    //测试字符串索引越界异常
    @Test
    public void testStringIndexOutOfBoundsException(){
        String str = "abc";
        System.out.println(str.charAt(3));
    }

    //测试数字格式异常
    @Test
    public void testNumberFormatException(){
        String str = "12.3";
        str = "a.3";
        float f = Float.parseFloat(str);
        System.out.println(f);
    }

    //测试算术异常
    @Test
    public void testArithmeticException(){
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

}
