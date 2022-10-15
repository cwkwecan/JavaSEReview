package com.wecan;

/**
 * @author cwk
 * @create 2022-10-12 13:37
 */
public class SwapNumberTest {
    public static void main(String[] args) {
        //方式一：经典代换
        //编写代码实现两个变量值交换，int m = 3, n =5;
        int m = 3;
        int n = 5;
        System.out.println("交换前：" + "m=" + m + ",n=" + n);
        int temp = m;
        m = n;
        n = temp;
        System.out.println("交换后：" + "m=" + m + ",n=" + n);

        System.out.println();

        //方式二：加减法
        int a = 3;
        int b = 5;
        a = a + b;
        b = a - b;//b的值是a了
        a = a - b;//a的值是b了
        System.out.println("a=" + a + ",b=" +  b);


        //方式三：异或法

    }
}
