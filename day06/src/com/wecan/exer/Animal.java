package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-28 16:40
 */
public class Animal {

    String name = "动物鼻祖";

    public static void main(String[] args) {

        //创建静态的Dog内部类实例（静态的成员内部类）
        Animal.Dog dog = new Dog();

        dog.run();

        //创建非静态的Bird内部类实例（非静态的成员内部类）
        Animal a = new Animal();
        Animal.Pig pig = a.new Pig();

        pig.run();

        System.out.println("*****************");
        pig.display("飞猪形参1号");

    }

    static class Dog{

        String name;//狗狗的姓名
        int age;//狗狗的年龄

        public void run(){
            System.out.println("狗跑的很快!");
        }

    }

    class Pig{

        String name = "飞猪1号";//猪的名字
        double weight;//猪的重量

        public void run(){
            System.out.println("猪太肥了，跑不动！");
        }

        public void eat(){
            System.out.println("猪吃饲料");
        }

        public void display(String name){
            System.out.println(name);//方法的形参
            System.out.println(this.name);//内部类的属性
            System.out.println(Animal.this.name);//外部类的属性
            eat();//外部类的方法，有重名的时候不可省略
            Animal.this.eat();//外部类的eat()方法

        }

    }

    public void eat(){
        System.out.println("动物进食~~");
    }

    public Comparable getComparable(){

        //创建一个实现了Comparable接口的类：局部内部类
        //方式1：
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();//返回一个匿名对象

        //方式2：
        return new Comparable(){

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
