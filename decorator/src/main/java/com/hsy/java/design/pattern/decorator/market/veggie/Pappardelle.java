package com.hsy.java.design.pattern.decorator.market.veggie;

import com.hsy.java.design.pattern.decorator.market.Noodle;

public class Pappardelle extends Noodle {

    // 这是一碗宽面条
    public String getDescription(){
        return "一碗宽面";
    }

    @Override
    public double cost() {
        // 每碗宽面条10块
        return 10.00;
    }
}
