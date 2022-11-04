package com.wecan.exer;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-11-03 17:48
 */
public class ExceptionTest {

    //*************************以下是编译时异常***************************
    @Test
    public void test7(){
//		File file = new File("hello.txt");
//		FileInputStream fis = new FileInputStream(file);
//
//		int data = fis.read();
//		while(data != -1){
//			System.out.println((char)data);
//			data = fis.read();
//		}
//
//		fis.close();
    }


    //*************************以下是运行时异常***************************
    //ArithmeticException
    @Test
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    //InputMismatchException
    @Test
    public void test5(){
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        System.out.println(score);
        scan.close();
    }

    //NumberFormatException
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }


    //ClassCastException
    @Test
    public void test3(){
        Object obj = new Date(0);
        String str = (String)obj;
    }


    //IndexOutOfBoundsException
    @Test
    public void test2(){
        //ArrayIndexOutOfBoundsException
//		int[] arr = new int[10];
//		System.out.println(arr[10]);
        //StringIndexOutOfBoundsException
        String str = "abc";
        System.out.println(str.charAt(3));

    }

    //NullPointerException
    @Test
    public void test1() {

//		int[] arr = null;
//		System.out.println(arr[0]);

        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));
    }

}
