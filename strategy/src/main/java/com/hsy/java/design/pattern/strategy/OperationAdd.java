package com.hsy.java.design.pattern.strategy;

/**
 * @author heshiyuan
 * @date 2021/5/14 14:36
 */
public class OperationAdd implements Strategy{
    @Override
    public int operation(int a, int b) {
        return a + b;
    }
}
