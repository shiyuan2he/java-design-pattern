package com.hsy.java.design.pattern.decorator.market.decorator;

import com.hsy.java.design.pattern.decorator.market.Noodle;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @description <p>香肠装饰器</p>
 * @author heshiyuan
 * 2018/11/8 21:14
 */
@NoArgsConstructor
@AllArgsConstructor
public class SausageDecorator extends NoodleDecorator{
    private Noodle noodle;
    @Override
    public String getDescription() {
        return noodle.getDescription() + "， + 一根香肠";
    }
    // 每根香肠一块钱
    @Override
    public double cost() {
        return noodle.cost() + 1.00;
    }
}
