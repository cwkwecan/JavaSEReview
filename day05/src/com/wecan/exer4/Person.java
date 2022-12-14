package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-25 18:53
 *
 * 按要求实现下列问题：
 * 1）封装一个西游记人物类Person：包含私有属性：姓名（name）、身高（height）、
 * 武器（weapon）、种族（race），并提供访问器（get方法）和修改器（set方法）
 * 2）在测试类中实例化三个对象：tangseng（唐僧）、sunwukong（孙悟空）、baigujing（白骨精），
 * 分别设置他们的种族为：人族、仙族、妖族
 * 3）在打印对象时，按照例如：“姓名：孙悟空；种族：仙族”的格式在控制台输出信息。
 * 4）提供一个技能方法void skill()，这个方法根据当前对象name属性判断技能，如果是孙悟空，
 * 就打印“七十二变”，如果是唐僧，就打印“紧箍咒”，如果是白骨精，就打印“九阴白骨爪”，在测试类中调用这个方法。
 * 5）重写equals方法进行判断，如果种族属性是人族或者仙族，则返回true，如果是妖族，则返回false，
 * 在测试类中对孙悟空和唐僧进行比较，打印结果，对唐僧和白骨金进行比较，并打印结果。
 *
 */
public class Person {

    private String name;
    private int height;//身高
    private String weapon;//武器
    private String race;//种族

    public Person() {
    }

    public Person(String name, int height, String weapon, String race) {
        this.name = name;
        this.height = height;
        this.weapon = weapon;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "姓名：" + name + "；种族：" + race;
    }

    public void skill(){
        if("孙悟空".equals(name)){
            System.out.println("七十二变");
        }else if("唐僧".equals(name)){
            System.out.println("紧箍咒");
        }else if("白骨精".equals(name)){
            System.out.println("九阴白骨爪");
        }
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person p = (Person) obj;
            if("妖族".equals(this.race)|| "妖族".equals(p.race)){
                return false;
            }
        }
        return true;
    }
}
