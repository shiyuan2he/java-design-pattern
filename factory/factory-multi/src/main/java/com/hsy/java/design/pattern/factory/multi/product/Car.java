package com.hsy.java.design.pattern.factory.multi.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.java.design.pattern.method.product
 * @date 2018/1/30 16:03
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class Car implements Machine{
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;
    @Override
    public void start() {
        _logger.info("汽车启动啦");
    }

    @Override
    public void speed() {
        _logger.info("汽车加速啦");
    }

    public void blow() {
        _logger.info("汽车按铃啦");
    }

    @Override
    public void stop() {
        _logger.info("汽车停车啦");
    }
}
