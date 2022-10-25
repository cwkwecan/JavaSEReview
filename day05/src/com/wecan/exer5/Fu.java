package com.wecan.exer5;

/**
 * @author cwk
 * @create 2022-10-25 21:10
 */
class Fu {
    boolean show(char a) {
        System.out.println(a);
        return true;
    }

}

//程序结果：AB

class Demo extends Fu {
    public static void main(String[] args) {
        int i = 0;
        Fu f = new Demo();
        Demo d = new Demo();
        for (f.show('A'); f.show('B') && (i < 2); f.show('C')) {
            i++;
            d.show('D');
        }
    }

    boolean show(char a) {
        System.out.println(a);
        return false;
    }
}
