package com.hsy.java.design.pattern.strategy;

/**
 * @author heshiyuan
 * @date 2021/5/14 14:35
 */
public interface Strategy {
    /**
     * 操作接口
     * @param a
     * @param b
     * @return
     */
    int operation(int a, int b);
}
