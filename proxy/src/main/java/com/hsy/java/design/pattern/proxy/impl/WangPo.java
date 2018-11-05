package com.hsy.java.design.pattern.proxy.impl;

import com.hsy.java.design.pattern.proxy.IKindWomen;

public class WangPo implements IKindWomen {
    private IKindWomen iKindWomen;
    // 默认是 潘金莲的代理
    public WangPo(){
        iKindWomen = new PanJinLian();
    }
    // 可以指定代理
    public WangPo(IKindWomen iKindWomen){
        this.iKindWomen = iKindWomen;
    }
    public void makeEyesWithMen() {
        iKindWomen.makeEyesWithMen();
    }

    public void happyWithMen() {
        iKindWomen.happyWithMen();
    }
}
