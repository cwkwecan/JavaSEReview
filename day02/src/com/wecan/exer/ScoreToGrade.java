package com.wecan.exer;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-15 23:07
 */
public class ScoreToGrade {

    public static void main(String[] args) {

        /*
        编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级：
        score>=90           等级：A
        70=<score<90        等级：B
        60=<score<70        等级：C
        score<60            等级：D
         */
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学生成绩：");
        int score = input.nextInt();
        if(score >= 90){
            System.out.println("等级：A");
        }else if(score >= 70){
            System.out.println("等级：B");
        }else if(score >= 60){
            System.out.println("等级：C");
        }else{
            System.out.println("等级：D");
        }
    }

}
