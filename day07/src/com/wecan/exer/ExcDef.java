package com.wecan.exer;

/**
 * @author cwk
 * @create 2022-11-03 22:09
 */
public class ExcDef extends Exception {

    //1、继承于现有的异常结构：RuntimeException、Exception

    //2、提供全局常量
    static final long serialVersonUID = 2423428394924293580L;

    //3、提供重载的构造器
    public ExcDef(){

    }

    public ExcDef(String msg){
        super(msg);
    }



}
