package com.wecan;

/**
 * @author cwk
 * @create 2022-10-12 12:36
 */
public class SuanShu {

    public static void main(String[] args){
        int a = 23;
        int b = 12;
        System.out.println(a + "+" + b + "=" + (a+b));//35
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);//35

        int sub = a - b;
        //System.out.println(a + "-" + b + "=" + a-b);//错误，原因是a + "-" + b + "=" + a的结果是字符串，字符串不能进行减法
        System.out.println(a + "-" + b + "=" + (a-b));//11
        System.out.println(a + "-" + b + "=" + sub);//11

        int mul = a * b;
        System.out.println(a + "*" + b + "=" + a*b);//276
        System.out.println(a + "*" + b + "=" + mul);//276

        //整数相除，只保留整数部分
        int div = a / b;
        System.out.println(a + "/" + b + "=" + a/b);//1
        System.out.println(a + "/" + b + "=" + div);//1

        double d = (double)a/b;//先把a的类型进行转换，转换成double类型，然后再和b相除
        System.out.println(a + "/" + b + "=" + d);//1.916666

        int yu = a % b;
        System.out.println(a + "%" + b + "=" + yu);//11

        System.out.println("------------------特殊的取模----------------------");
        System.out.println(5%2);//1
        System.out.println(-5%-2);//-1
        System.out.println(-5%2);//-1
        System.out.println(5%-2);//1

        System.out.println("------------------负号----------------------");
        int num1 = 12;
        int num2 = -num1;
        System.out.println("num2=" + num2);//-12

        System.out.println("------------------自增----------------------");
        int i = 0;
        System.out.println("自增之前i=" + i);//0
        i++;// i = i + 1 = 1
        System.out.println("自增第一次之后i=" + i);//1
        ++i;// i = i + 1 = 2
        System.out.println("自增第二次之后i=" + i);//2
        int j = ++i;//把i自增1，然后结果赋值给j，或者说，先算++i，然后再赋值
        System.out.println("自增第三次之后i=" + i);//3
        System.out.println("j="+j);//3
        int k = i++;//先算赋值，把i的值赋值给k，i原来是3，把3赋值给k，然后i在自增1，i变成4
        System.out.println("自增第四次之后i=" + i);//4
        System.out.println("k="+k);//3

        //面试题：陷阱题
        i = i++;//先赋值，把i原来的值重新赋值给i，不变，然后i自增，但是这个自增后的值没有在放回变量i的位置
        System.out.println("自增第五次之后i=" + i);//4
    }

}

class Demo {
    public static void main(String[] args) {
        int a = 3, b = 8;

        int c = (a > b) ? a++ : b++;
        System.out.println("a=" + a + "\tb=" + b + "\tc=" + c);  //3,9,8
        //a=3,b=9,c=8;
        int d = (a > b) ? ++a : ++b;
        System.out.println("a=" + a + "\tb=" + b + "\td=" + d);  //3,10,10
        //a=3,b=10,c=8,d=10;
        int e = (a < b) ? a++ : b++;
        System.out.println("a=" + a + "\tb=" + b + "\te=" + e);  //4,10,3
        //a=4,b=10,c=8,d=10,e=3;
        int f = (a < b) ? ++a : ++b;
        System.out.println("a=" + a + "\tb=" + b + "\tf=" + f);  //5,10,5
    }
}

//如何求一个0~255范围内的整数的十六进制值，例如60的十六进制表示形式3C
class JinZhiConvert{
    public static void main(String[] args) {
        String str1 = Integer.toHexString(60);//十进制转16进制
        String str2 = Integer.toBinaryString(60);//十进制转二进制

        System.out.println(str1);
        System.out.println(str2);
    }
}

class AssignmentOperator{

    public static void main(String[] args) {

        short s = 10;
        //错误的：
        //s = s + 2;//隐含自动类型转换2是int型
        //正确的：
        s = (short)(s + 2);//s+2的运算结果是int型，需要强制转换类型
        s += 2;
        System.out.println(s);
    }

}


class TemperatureConvert{

    public static void main(String[] args) {
        //小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
        //它需要一个程序将华氏温度（80度）转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。

        int t1 = 80;
        double t2 = (t1 - 32) / 1.8;
        //Math.round(float/double a)：将浮点型进行“四舍五入”转换为int类型的一个方法（不含小数点.0）！
        System.out.println(t1 + "华氏度，是摄氏度" + Math.round(t2));
    }
}