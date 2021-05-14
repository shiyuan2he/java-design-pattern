package com.hsy.java.design.pattern.strategy;

/**
 * @author heshiyuan
 * @date 2021/5/14 14:37
 */
public class OperationMultiply implements Strategy{
    @Override
    public int operation(int a, int b) {
        return a * b;
    }
}
