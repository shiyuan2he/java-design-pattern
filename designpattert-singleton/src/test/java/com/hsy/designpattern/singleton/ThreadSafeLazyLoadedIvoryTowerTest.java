package com.hsy.designpattern.singleton;
import java.util.function.Supplier;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 3:00 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class ThreadSafeLazyLoadedIvoryTowerTest extends SingletonTest<ThreadSafeLazyLoadedIvoryTower>{
    public ThreadSafeLazyLoadedIvoryTowerTest() {
        super(ThreadSafeLazyLoadedIvoryTower::getInstance);
    }
}
