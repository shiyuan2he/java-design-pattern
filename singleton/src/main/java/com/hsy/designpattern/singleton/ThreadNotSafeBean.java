package com.hsy.designpattern.singleton;

/**
 * @author heshiyuan
 * @description <p>线程安全的懒汉单例模式</p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 2:56 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class ThreadNotSafeBean {
    // 类加载时候不实例化
    private static ThreadNotSafeBean instance ;

    // 第一次用到的时候实例化，懒加载，线程不安全
    public static ThreadNotSafeBean getInstance(){
        /**
         * 以下代码线程不安全，多线程情况下可能会new出来多个实例
         */
        if(null == instance){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new ThreadNotSafeBean() ;
        }
        return instance ;
    }
}
