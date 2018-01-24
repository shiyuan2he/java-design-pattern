package com.hsy.java.design.pattern.impl;

import com.hsy.java.design.pattern.IUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heshiyuan
 * @description <p>对象适配器模式</p>
 * @path java-design-pattern/com.hsy.java.design.pattern
 * @date 2018/1/24 17:20
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class UserDaoImpl2 implements IUserDao {
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;
    @Override
    public void doOne() {
        _logger.info("处理单一业务");
    }

    @Override
    public void doAll() {
        new BaseDaoImpl().doAll();
    }
}
