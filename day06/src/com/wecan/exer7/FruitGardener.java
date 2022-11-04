package com.wecan.exer7;

/**
 * @author cwk
 * @create 2022-10-31 15:50
 */
public class FruitGardener {

    public Fruit getFruit(String fruitName){
        if("草莓".equals(fruitName)){
            return new Strawberry();
        }else if("苹果".equals(fruitName)){
            return new Apple();
        }else if("葡萄".equals(fruitName)){
            return new Grape();
        }else{
            return null;
        }
    }
}
