package com.hsy.java.design.pattern.decorator.market.veggie;

import com.hsy.java.design.pattern.decorator.market.Noodle;
public class Vermicelli extends Noodle {
    // 这是一碗细面条
    public String getDescription(){
        return "一碗细面" ;
    }
    /**
     * @description <p>每碗细面条11块</p>
     * @author heshiyuan
     * 2018/11/8 20:51
     */
    @Override
    public double cost() {
        return 11;
    }
}
