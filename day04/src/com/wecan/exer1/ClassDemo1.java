package com.wecan.exer1;

/**
 * @author cwk
 * @create 2022-10-21 17:27
 */
public class ClassDemo1 {
    public static void main(String[] args){
        int x = 1;
        for(show('a'); show('b') && x<3; show('c')){
            show('d');
            x++;
        }
    }
    public static boolean show(char ch){
        System.out.print(ch);//abdcbdcb
        return true;
    }

}
