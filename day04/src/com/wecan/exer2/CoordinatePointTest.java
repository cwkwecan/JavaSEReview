package com.wecan.exer2;

/**
 * @author cwk
 * @create 2022-10-21 22:51
 */
public class CoordinatePointTest {

    public static void main(String[] args) {

        CoordinatePoint coordPoint = new CoordinatePoint(3,4);

        double originDistance = coordPoint.getOriginPointDistance();
        System.out.println("当前点到原点的距离为：" + originDistance);

        double randPointDist = coordPoint.getRandomPointDistance(-3, -4);
        System.out.println("当前点到任一点(m,n)的距离为：" + randPointDist);

        double randPointDist1 = coordPoint.getRandPointDist(new Point(-2, -8));
        System.out.println("当前点到任一点(Point p)的距离为：" + randPointDist1);

        System.out.println(coordPoint.showCoordinatePoint());

    }
}
