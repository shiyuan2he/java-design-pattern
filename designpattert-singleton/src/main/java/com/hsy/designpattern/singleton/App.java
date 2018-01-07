package com.hsy.designpattern.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 2:31 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class App {
    private static final Logger _logger = LoggerFactory.getLogger(App.class);
    public static void main(String args[]){
        // double checked locking
        ThreadSafeDoubleCheckLocking dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
        _logger.info(dcl1.toString());
        ThreadSafeDoubleCheckLocking dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
        _logger.info(dcl2.toString());
    }
}
