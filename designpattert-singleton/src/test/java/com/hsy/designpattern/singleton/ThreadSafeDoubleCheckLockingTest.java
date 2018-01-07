package com.hsy.designpattern.singleton;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 9:52 AM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class ThreadSafeDoubleCheckLockingTest extends SingletonTest<ThreadSafeDoubleCheckLocking>{
    public ThreadSafeDoubleCheckLockingTest() {
        super(ThreadSafeDoubleCheckLocking::getInstance);
    }
}
