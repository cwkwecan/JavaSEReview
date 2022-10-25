package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-25 18:57
 */
public class PersonTest {

    public static void main(String[] args) {

        Person tangseng = new Person("唐僧", 2, "禅杖", "人族");
        Person sunwukong = new Person("孙悟空", 2, "金箍棒", "仙族");
        Person baigujing = new Person("白骨精", 3, "九阴白骨爪", "妖族");

        System.out.println(tangseng);
        System.out.println(sunwukong);
        System.out.println(baigujing);

        System.out.println("*********************************");

        tangseng.skill();
        sunwukong.skill();
        baigujing.skill();

        System.out.println("*********************************");

        System.out.println(sunwukong.equals(tangseng));
        System.out.println(tangseng.equals(baigujing));
    }
}
