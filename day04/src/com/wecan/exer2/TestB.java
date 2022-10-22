package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-22 22:38
 */

class Value{
    int i = 15;
}
class TestB{
    public static void main(String argv[]) {
        TestB t = new TestB();
        t.first();
    }

    public void  first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }

    public void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.print(v.i + " " + i);
    }
}
