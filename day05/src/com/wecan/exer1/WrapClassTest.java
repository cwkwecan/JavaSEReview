package com.wecan.exer1;

import org.junit.Test;

/**
 * @author cwk
 * @create 2022-10-24 22:04
 */
public class WrapClassTest {

    @Test
    public void test1(){

        //基本数据类型 --> 包装类：调用包装类的构造器

        int num = 10;
        Integer in1 = new Integer(num);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        Integer in3 = new Integer("123");
        System.out.println(in3.toString());


        //包装类 --> 基本数据类型：调用包装类的xxxValue()

        Float f1 = new Float(12.3f);
        System.out.println(f1);
        float f2 = f1.floatValue();
        System.out.println(f2);

    }

    @Test
    public void test2(){

        //jdk5.0新特性
        //自动装箱：基本数据类型 ---> 包装类
        int num = 10;
        Integer in1 = num;//自动装箱

        boolean b1 = true;
        Boolean b2 = b1;//自动装箱


        //自动拆箱：包装类 --> 基本数据类型
        //将包装类的对象赋给基本数据类型
        int num1 = in1;//自动拆箱

    }

    //String类型 --> 基本数据类型、包装类：调用包装类的parseXxx()
    @Test
    public void test3(){

        String str1 = "123";

        //可能会报NumberFormatException
        int num = Integer.parseInt(str1);
        System.out.println(num);


        String str2 = "tRue";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

    }

    //基本数据类型、包装类 --> String类型：调用String重载的valueOf(Xxx xxx)
    @Test
    public void test4(){
        int num = 10;
        //方式1：连接运算
        String str = num + "";
        System.out.println(str);
        //方式二：调用String的valueOf()
        String str2 = String.valueOf(num);
        System.out.println(str2);

        Float f1 = new Float(12.3F);
        String str3 = String.valueOf(f1);
        System.out.println(str3);

    }
}
