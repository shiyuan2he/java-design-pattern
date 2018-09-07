package com.hsy.java.design.pattern.method.factory;

import com.hsy.java.design.pattern.method.product.Machine;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.java.design.pattern.method
 * @date 2018/1/30 15:57
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public abstract class Factory {

    public abstract <T extends Machine> T createMachine(Class<T> c);
}
