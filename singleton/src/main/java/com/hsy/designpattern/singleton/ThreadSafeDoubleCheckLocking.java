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
    /**
     *  类加载不实例化，并且使用volatile修饰
     *  volatile作用：当volatile修饰的变量在某一个线程发生改变时，会在所有用的此变量的线程刷新成新的值
     */
    private static volatile ThreadSafeDoubleCheckLocking instance ;

    /**
     * 私有化构造器
     */
    private ThreadSafeDoubleCheckLocking(){
        // 防止使用反射实例化ThreadSafeDoubleCheckLocking实例
        if(null != instance){
            throw new IllegalStateException("Already initialized!") ;
        }
    }
    /**
     * @description <p>给类添加同步锁实现单例模式</p>
     * @return 唯一单例对象
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
