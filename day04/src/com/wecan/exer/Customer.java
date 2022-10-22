package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-21 15:48
 */
public class Customer {

    private String name;
    private long idCard;
    private String phone;
    private String address;

    public Customer(){

    }

    public Customer(String name,long idCard,String phone,String address){
        this.name = name;
        this.idCard = idCard;
        this.phone = phone;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setIdCard(long idCard){
        this.idCard = idCard;
    }

    public long getIdCard(){
        return idCard;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public String say(){
        return "name:" + name + " ,idCard:" + idCard + " ,phone:" + phone
                + " ,address:" + address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", idCard=" + idCard +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
