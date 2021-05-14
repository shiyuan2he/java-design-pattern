package com.hsy.java.design.pattern.strategy;

/**
 * @author heshiyuan
 * @date 2021/5/14 14:38
 */
public class Context {
    Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.operation(a, b);
    }
}
