package com.wecan.exer1;

import java.util.Date;

/**
 * @author cwk
 * @create 2022-10-25 16:53
 */
public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person(42214243242421422L,"男","张三",23,
                "北京市朝阳区", new Date(23432533241L));
        Person p2 = new Person(42214243242421426L,"男","张三",23,
                "北京市朝阳区", new Date(23432533241L));

        System.out.println(p1.toString());

        System.out.println(p1.equals(p2));

    }
}
