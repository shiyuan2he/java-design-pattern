package com.hsy.java.design.pattern.decorator.market.decorator;

import com.hsy.java.design.pattern.decorator.market.Noodle;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class DouPiErDecorator extends NoodleDecorator{
    private Noodle noodle;
    @Override
    public String getDescription() {
        return noodle.getDescription() + ", + 一张豆皮儿";
    }

    @Override
    public double cost() {
        return noodle.cost() + 1.00;
    }
}
