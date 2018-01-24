package com.hsy.java.design.pattern.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.java.design.pattern
 * @date 2018/1/24 17:21
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class BaseDaoImpl {
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;
    public void doAll(){
        _logger.info("处理所有业务");
    }
}
