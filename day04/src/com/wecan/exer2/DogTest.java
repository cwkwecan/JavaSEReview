package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-21 22:21
 */
public class DogTest {

    public static void main(String[] args) {

        Dog dog = new Dog("小黑", "金黄色", 3);
        String dogInfo = dog.show();
        System.out.println(dogInfo);


    }
}
