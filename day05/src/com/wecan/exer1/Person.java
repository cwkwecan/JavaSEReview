package com.wecan.exer1;

import java.util.Date;

/**
 * @author cwk
 * @create 2022-10-25 16:35
 */
public class Person {

    private long idCard;//身份证号
    private String gender;//性别
    private String name;//姓名
    private int age;//年龄
    private String huJi;//户籍
    private Date birthday;//出生日期

    public Person() {
    }

    public Person(long idCard, String gender, String name, int age, String huJi, Date birthday) {
        this.idCard = idCard;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.huJi = huJi;
        this.birthday = birthday;
    }

    public String toString(){
        return "self-introduction{" + "idCard=" + idCard
                + ",name=" + "\'" + name + "\'" +  ",huJi="
                + "\'" + huJi + "\'";
    }

    public boolean equals(Object obj){
        //如果当前对象和传进来的对象的地址值相等，则说明两者实体内容相同
        if(this == obj){
            return true;
        }
        //如果obj是Person的实例
        if(obj instanceof Person){
            //将obj向下转型为Person
            Person p = (Person) obj;
            return this.idCard == p.idCard && this.name.equals(p.name);
        }else{
            //如果obj不是Person的实例的话，返回false
            return false;
        }
    }


}
