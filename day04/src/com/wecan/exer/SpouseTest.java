package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-20 16:46
 */
public class SpouseTest {//spouse n.配偶 v.和...结婚

    public static void main(String[] args) {

        Husband husband = new Husband("夏洛", 23);
        Wife wife = new Wife("马冬梅", 21);

        husband.setWife(wife);
        wife.setHusband(husband);

        System.out.println(husband.getInfo());
        System.out.println("*************************");
        System.out.println(wife.getInfo());
    }
}
