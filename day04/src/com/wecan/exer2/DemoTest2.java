package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 21:57
 */
public class DemoTest2 {

    int a;
    int b;
    public void f(){
        a = 0;
        b = 0;
        int[] c = {0};
        g(b,c);
        System.out.println(a + " " + b + " " + c[0]);//1 0 1
    }
    public void g(int b, int[] c){
        a = 1;
        b = 1;
        c[0] = 1;
    }
    public static void main(String[] args) {
        DemoTest2 t = new DemoTest2();
        t.f();
    }

}
