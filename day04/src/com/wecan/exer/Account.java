package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-21 15:47
 *
 * 定义银行账户类Account，有属性：卡号cid，余额balance，所属用户Customer
 * 银行账户类Account有方法：
 * （1）getInfo()，返回String类型，返回卡的详细信息
 * （2）取钱方法withdraw()，参数自行设计，如果取钱成功返回true，失败返回false
 * （3）存钱方法save()，参数自行设计，如果存钱成功返回true，失败返回false
 *
 * 其中Customer类有姓名、身份证号、联系电话、家庭地址等属性
 *     Customer类有方法say()，返回String类型，返回他的个人信息。
 *
 * 在测试类Bank中创建银行账户类对象和用户类对象，并设置信息，与显示信息
 *
 */
public class Account {

    private int cid;
    private double balance;
    private Customer customer;

    public Account(){

    }

    public Account(int cid,double balance){
        this.cid = cid;
        this.balance = balance;
    }

    public void setCid(int cid){
        this.cid = cid;
    }

    public int getCid(){
        return cid;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public Customer getCustomer(){
        return customer;
    }

    public String getInfo(){
        return "cid:" + cid + " ,balance:" + balance + " ," + customer;
    }

    public boolean withdraw(double mount){
        if(mount <= balance){
            balance -= mount;
            return true;
        }
        return false;
    }

    public boolean save(double mount){
        if(mount > 0){
            balance += mount;
            return true;
        }
        return false;
    }
}
