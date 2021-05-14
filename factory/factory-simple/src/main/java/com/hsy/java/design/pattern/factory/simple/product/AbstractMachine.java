package com.hsy.java.design.pattern.factory.simple.product;

/**
 * @author heshiyuan
 * @date 2021/5/11 17:31
 */
public abstract class AbstractMachine {
    /**
     * 车发动起来
     */
    protected void start() {
        System.out.println("启动");
    }

    /**
     * 车加速度
     */
    protected void speed() {
        System.out.println("加速");
    }

    protected void slow() {
        System.out.println("减速");
    }

    /**
     * 车制动
     */
    protected void stop(){
        System.out.println("制动");
    }
}
