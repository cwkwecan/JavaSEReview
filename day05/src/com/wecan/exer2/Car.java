package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-25 17:51
 */
public class Car extends Vehicle {

    private int loader;//载人数

    public Car() {
    }

    public Car(int wheels, int weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                '}';
    }
}
