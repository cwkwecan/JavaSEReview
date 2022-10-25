package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-10-23 19:48
 */
public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Faculty();

        Person p2 = new Staff();

        //向下转型
        if(p1 instanceof Faculty){//如果p1是Faculty的实例
            Faculty fac = (Faculty) p1;
            fac.setDegree("本科");
            System.out.println(fac.getDegree());
        }

        if(p2 instanceof Staff){
            Staff staff = (Staff) p2;
            staff.setDuty("职员");
            System.out.println(staff.getDuty());
        }

    }
}
