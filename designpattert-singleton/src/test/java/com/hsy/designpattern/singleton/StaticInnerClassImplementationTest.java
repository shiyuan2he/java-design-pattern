package com.hsy.designpattern.singleton;

import java.util.function.Supplier;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 3:29 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class StaticInnerClassImplementationTest extends SingletonTest<StaticInnerClassImplementation> {
    public StaticInnerClassImplementationTest() {
        super(StaticInnerClassImplementation::getInstance);
    }
}
