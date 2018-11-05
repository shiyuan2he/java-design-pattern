package com.hsy.java.design.pattern.proxy.impl;

import com.hsy.java.design.pattern.proxy.IKindWomen;
public class PanJinLian implements IKindWomen {
    public void makeEyesWithMen() {
        System.out.println("注意：潘金莲正在抛媚眼。。。");
    }

    public void happyWithMen() {
        System.out.println("嘿嘿：潘金莲正在跟男人做爱。。。");
    }
}
