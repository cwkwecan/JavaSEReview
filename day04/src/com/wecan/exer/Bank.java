package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-21 16:08
 */
public class Bank {

    public static void main(String[] args) {

        Account acct = new Account(1001,5000);

        Customer cust = new Customer("李四",32425199702183256L,"12324","北京市朝阳区");

        acct.setCustomer(cust);

        System.out.println(acct.getBalance());

        boolean isSuccess = acct.withdraw(200);
        if (isSuccess) {
            System.out.println("取钱成功");
        }else{
            System.out.println("取钱失败");
        }

        System.out.println(acct.getInfo());

        System.out.println();

        String say = cust.say();
        System.out.println(say);

    }
}
