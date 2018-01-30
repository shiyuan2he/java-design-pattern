package com.hsy.java.design.pattern.factory.simple.product;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.java.design.pattern.method
 * @date 2018/1/30 15:58
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public interface Machine {
    // 车发动起来
    void start() ;
    // 车加速度
    void speed() ;
    // 车制动
    void stop() ;
}
