package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-21 22:08
 */
public class BoxTest {

    public static void main(String[] args) {

        Box box = new Box(4,3,2);

        int volume = box.getVolume();
        System.out.println(volume);

    }
}
