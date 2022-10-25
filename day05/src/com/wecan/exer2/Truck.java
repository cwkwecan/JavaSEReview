package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-25 17:52
 */
public class Truck extends Car {

    private int payload;//载重量

    public Truck() {
    }

    public Truck(int wheels, int weight, int loader, int payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                '}';
    }
}
