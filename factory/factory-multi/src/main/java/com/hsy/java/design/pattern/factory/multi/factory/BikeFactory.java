package com.hsy.java.design.pattern.factory.multi.factory;

import com.hsy.java.design.pattern.factory.multi.product.Bike;
import com.hsy.java.design.pattern.factory.multi.product.Machine;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.java.design.pattern.factory.multi.factory
 * @date 2018/2/1 9:38
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class BikeFactory extends AbstractMultiMachineFactory{
    @Override
    public Machine createMaching() {
        return new Bike();
    }
}
