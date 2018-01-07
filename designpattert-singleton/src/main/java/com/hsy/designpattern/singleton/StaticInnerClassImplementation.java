package com.hsy.designpattern.singleton;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 3:13 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public final class StaticInnerClassImplementation {
    // 私有化构造器
    private StaticInnerClassImplementation(){}

    public static StaticInnerClassImplementation getInstance(){return HelpHolder.INSTANCE;}

    private static class HelpHolder{
        private static final StaticInnerClassImplementation INSTANCE  = new StaticInnerClassImplementation() ;
    }
}
