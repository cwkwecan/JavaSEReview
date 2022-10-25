package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-25 17:54
 */
public class Test {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(4, 250);

        Car car = new Car(4, 150, 5);

        Truck truck = new Truck(4, 200, 2, 10);

        System.out.println(vehicle.toString());

        System.out.println(car.toString());

        System.out.println(truck.toString());

    }
}
