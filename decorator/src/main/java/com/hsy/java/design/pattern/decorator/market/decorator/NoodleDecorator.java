package com.hsy.java.design.pattern.decorator.market.decorator;

import com.hsy.java.design.pattern.decorator.market.Noodle;
/**
 * @description <p>面条包装类，包装的对象必须继承此类，加上自己的描述</p>
 * @author heshiyuan
 * 2018/11/8 20:55
 */
public abstract class NoodleDecorator extends Noodle {
    // 子类必须声明自己的特性
    abstract public String getDescription();
}
