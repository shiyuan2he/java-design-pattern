package com.hsy.java.design.pattern.proxy.impl;

import com.hsy.java.design.pattern.proxy.IKindWomen;
/**
 * @description <p>贾氏也是同道中人<p>
 * @author heshiyuan
 * @date 2018/11/5 15:26
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * @copyright Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * I'm glad to share my knowledge with you all.
 * @price ¥5    微信：hewei1109
 */
public class JiaShi implements IKindWomen {
    public void makeEyesWithMen() {
        System.out.println("注意：贾氏正在抛媚眼。。。");
    }

    public void happyWithMen() {
        System.out.println("哈哈：贾氏正在跟男人做爱。。。");
    }
}
