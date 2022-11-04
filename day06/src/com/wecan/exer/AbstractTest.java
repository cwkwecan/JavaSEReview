package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-28 12:49
 */
public class AbstractTest {

    //抽象类不能造对象（Person类是抽象的，不能被实例化）
//    Person p = new Person();// 'Person' is abstract cannot be instantiated

}

abstract class Creature{

    //1.抽象类中可以没有抽象方法
//    public void breath(){
//
//    }

    //4.抽象类中一定有构造器，便于子类对象实例化时调用（涉及：子类对象实例化的全过程）
    //原因：提供给子类创建对象调用父类构造器使用的。
//    public Creature() {
//    }

    //说明：
    //2.抽象方法没有方法体
    //3.包含抽象方法的类，一定是抽象类。
    public abstract void breath();

    public abstract void eat();
}

//类Person要么被声明为抽象类，要么实现类Creature中的抽象方法breath()
class Person extends Creature{

//    @Override
//    public void breath() {
//
//    }

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void breath() {
        System.out.println("人呼吸");
    }

    @Override
    public void eat() {

    }
}