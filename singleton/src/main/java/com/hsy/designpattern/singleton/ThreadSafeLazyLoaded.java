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
public class ThreadSafeLazyLoaded {
    private static ThreadSafeLazyLoaded instance ;
    public ThreadSafeLazyLoaded(){
        //防止反射调用
        if(null!=instance){
            throw new IllegalStateException("Already initialized!") ;
        }
    }
    // 第一次用到的时候实例化，懒加载，线程安全
    public static synchronized ThreadSafeLazyLoaded getInstance(){
        if(null == instance){
            instance = new ThreadSafeLazyLoaded() ;
        }
        return instance ;
    }
}
