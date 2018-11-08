package com.hsy.java.design.pattern.decorator.market;
/**
 * @description <p>面条</p>
 * @author heshiyuan
 * @dateTime 2018/11/8 20:34
 * @copyright Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 *  I'm glad to share my knowledge with you all.
 *  @price 3毛    微信：hewei1109
 */
public abstract class Noodle {
    // 面食描述，不知何种面条
    public String getDescription(){
        return "unknown";
    }
    /**
     * @description <p>面类未知，暂无定价</p>
     * @author heshiyuan
     * 2018/11/8 20:37
     */
    abstract public double cost();
}
