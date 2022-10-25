package com.wecan.exer5;

/**
 * @author cwk
 * @create 2022-10-25 21:15
 */
class Fu1 {

    int num = 4;

    void show() {
        System.out.println("showFu");
    }

}

class Zi extends Fu1 {
    int num = 5;

    void show() {
        System.out.println("showZi");
    }
}

class T {
    public static void main(String[] args) {
        Fu1 f = new Zi();
        Zi z = new Zi();
        System.out.println(f.num);
        System.out.println(z.num);
        f.show();
        z.show();
    }
}
