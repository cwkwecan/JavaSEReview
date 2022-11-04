package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-27 19:27
 */
public class OrderTest {

    public static void main(String[] args) {

        Order1 o1 = new Order1(9);

        o1.setId(12);

        int id = o1.getId();
        System.out.println(id);
    }
}

class Order1{

    private int id = 3;

    {
        id = 6;
    }

    public Order1(int id){
        this.id = id;
    }

    public Order1() {

    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
