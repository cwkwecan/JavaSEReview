package com.wecan.exer6;

/**
 * @author cwk
 * @create 2022-10-25 21:35
 */
class Super {
    int i = 0;

    public Super(String a) {
        System.out.println("A");
        i = 1;
    }

    public Super() {
        System.out.println("B");
        i += 2;
    }
}

class Demo extends Super {
    public Demo(String a) {
        // super();
        System.out.println("C");
        i = 5;
    }

    public static void main(String[] args) {
        int i = 4;
        Super d = new Demo("A");
        System.out.println(d.i);
    }
}


