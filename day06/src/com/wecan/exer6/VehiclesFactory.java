package com.wecan.exer6;

/**
 * @author cwk
 * @create 2022-10-31 13:30
 */
public class VehiclesFactory {

    //静态属性或方法可以直接通过类名来调用
    //类名.属性（或方法）
    public static Horse getHorse(){
        return new Horse();
    }

    public static Boat getBoat(){
        return new Boat();
    }

}
