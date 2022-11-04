package com.wecan.exer4;

/**
 * @author cwk
 * @create 2022-10-31 11:24
 *
 * 有一个Car类，有属性temperature（温度），车内有Air（空调），有吹风的功能flow，Air会监视车内的温度，
 * 如果温度超过40度则吹冷气。如果温度低于0度则吹暖气，如果在这之间则关掉空调。实例化具有不同温度的Car对象，
 * 调用空调的flow方法，测试空调吹的风是否正确
 *
 */
public class Car {

    private double temperature;//温度

    public Car(){

    }

    public Car(double temperature){
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature > 40){
                System.out.println("吹冷风");
            }else if(temperature < 0){
                System.out.println("吹热风");
            }else{
                System.out.println("关闭空调");
            }
        }
    }

    public Air getAir(){
        return new Air();
    }

    public static void main(String[] args) {
//        Car c1 = new Car(41);
////        Car c2 = new Car(-2);
////        Car c3 = new Car(30);
////
////        Air a1 = c1.new Air();
////        Air a2 = c2.new Air();
////        Air a3 = c3.new Air();
////
////        a1.flow();
////        a2.flow();
////        a3.flow();

        Car c1 = new Car(45);
        Car c2 = new Car(-10);

        c1.getAir().flow();
        c2.getAir().flow();

    }

}
