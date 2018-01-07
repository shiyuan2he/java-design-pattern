package com.hsy.designpattern.singleton;

/**
 * @author heshiyuan
 * @description <p>线程安全双重锁</p>
 * @path java-design-pattern/com.hsy.designpattern.singletom
 * @date 11/09/2017 8:47 AM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class ThreadSafeDoubleCheckLocking {
    private static volatile ThreadSafeDoubleCheckLocking instance ;

    private ThreadSafeDoubleCheckLocking(){
        if(null != instance){
            throw new IllegalStateException("Already initialized!") ;
        }
    }
    /**
     * @description <p></p>
     * @param
     * @return No such property: code for class: Script1
     * @author heshiyuan 
     * @date 11/09/2017 9:53 AM
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    public static ThreadSafeDoubleCheckLocking getInstance(){
        ThreadSafeDoubleCheckLocking result = instance ;
        if(null == result){
            synchronized (ThreadSafeDoubleCheckLocking.class){
                result = instance ;
                if(null == result){
                    instance = result = new ThreadSafeDoubleCheckLocking() ;
                }
            }
        }
        return result ;
    }
}
