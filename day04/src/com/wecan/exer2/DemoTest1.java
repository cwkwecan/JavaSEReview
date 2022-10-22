package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 17:33
 */
public class DemoTest1 {

    public static void main(String[] args) {
        String str = new String("world");
        char[] ch = new char[]{'h','e','l','l','o'};
        change(str,ch);
        System.out.println(str);
        //valueOf(char[] data)：Returns the string representation of the char array argument.
        //valueOf(char[] data)：返回char数组参数的字符串表示形式
        System.out.println(String.valueOf(ch));
    }
    public static void change(String str, char[] arr){
        str = "change";
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        arr[4] = 'e';
    }

}
