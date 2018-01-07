package com.hsy.designpattern.singleton;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 3:33 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class HungryManImplementation {
    private HungryManImplementation(){}
    private static final HungryManImplementation instance = new HungryManImplementation();
    public static HungryManImplementation getInstance(){
        return instance ;
    }
}
