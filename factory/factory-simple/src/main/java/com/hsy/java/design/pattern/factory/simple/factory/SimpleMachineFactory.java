package com.hsy.java.design.pattern.factory.simple.factory;

import com.hsy.java.design.pattern.factory.simple.product.Machine;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.java.design.pattern.method
 * @date 2018/1/30 16:01
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class SimpleMachineFactory {
    public static <T extends Machine> T createMachine(Class<T> c) {
        Machine machine = null ;
        try {
            machine = (Machine) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) machine;
    }
}
