package com.wecan.exer;

import java.util.Scanner;

/**
 * @author cwk
 * @create 2022-10-16 16:30
 */
public class BetNumberTest {

    public static void main(String[] args) {

        /*
        赌数游戏
        提供三个1-6的随机数，作为掷骰子得到的点数。如果各个点数相同，则为豹子。
        如果三个骰子点数和，小于或等于9，则为“小”。
        如果三个骰子点数和，大于9，则为“大”。
        用户随机选择：押大、押小或者押豹子。通过判断，输出客户是否押正确。
         */
        //Math.random()：返回一个带正号的double值，该值大于等于0.0且小于1.0
        // [0.0,1.0)：左闭右开
        // [0.0,1.0) * 6 = [0.0,6.0) + 1 = [1.0,7.0) -> 取整 = [1,7) = [1,6]
        int num1 = (int)(Math.random() * 6 + 1);
        int num2 = (int)(Math.random() * 6 + 1);
        int num3 = (int)(Math.random() * 6 + 1);

        String result = "";
        if(num1 == num2 && num1 == num3){
            result = "豹子";
        }else if((num1 + num2 + num3) <= 9){
            result = "小";
        }else if((num1 + num2 + num3) > 9){
            result = "大";
        }

        Scanner input = new Scanner(System.in);
        System.out.println("请押宝，买定离手(选择：大、小、豹子)：");
        String guess = input.next();
        if(result.equals(guess)){//result调用equals()比guess.equals()可靠，避免了空指针异常
            System.out.println("恭喜你，押对了！");
        }else{
            System.out.println("很遗憾，押错了！");
        }
    }
}
