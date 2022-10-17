package com.wecan.exer2;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-16 17:15
 */
public class GuessNumberTest {

    public static void main(String[] args) {

        /*
        猜数字游戏
        随机生成一个100以内的数，猜数字游戏：
        从键盘输入数，如果大了提示，大了，如果小了，提示小了，如果对了，就不再猜了，并统计一共猜了多少次？
        提示：随机数
        import java.util.Random;
        Random rand = new Random();
        int num= rand.nextInt(100);
         */
        int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);

        int cnt = 0;//用来记录猜数的次数
        for(;;){
            System.out.println("请输入要猜的数：");
            int guess = input.nextInt();
            if(guess == number){
                cnt++;
                System.out.println("恭喜你，猜对了！");
                break;
            }else if(guess > number){
                cnt++;
                System.out.println("大了");
            }else{
                cnt++;
                System.out.println("小了");
            }
        }
        System.out.println("你一共猜了" + cnt + "次");
    }
}
