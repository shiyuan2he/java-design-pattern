package com.hsy.java.design.pattern.proxy.impl;

public class XiMenQing {
    public static void main(String[] args){
        //西门庆找上王婆，联系潘金莲
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMen();
        wangPo.happyWithMen();
        System.out.println("几天后----------------");
       // 西门庆找王婆，联系贾氏
        WangPo wangPo2 = new WangPo(new JiaShi());
        wangPo2.makeEyesWithMen();
        wangPo2.happyWithMen();
    }
}
