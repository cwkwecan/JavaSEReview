package com.wecan.exer;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-15 22:51
 */
public class IfTest1 {

    public static void main(String[] args) {

        /*
        使用条件结构实现，如果用户名等于字符‘青’，密码等于数字‘123’，就输出“欢迎你，青”，
        否则就输出“对不起，你不是青”。
         */
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String str = input.next();
        //charAt(int index)：返回指定索引上的char值
        char userName = str.charAt(0);
        System.out.print("请输入密码：");
        int password = input.nextInt();
        if(userName == '青' && password == 123){
            System.out.println("欢迎你，青");
        }else{
            System.out.println("对不起，你不是青");
        }
    }

}
