package com.hsy.designpattern.singleton;

/**
 * @author heshiyuan
 * @description <p>恶汉模式</p>
 * @path java-design-pattern/com.hsy.designpattern.singleton
 * @date 11/09/2017 3:33 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class HungryManImplementation {
    /**
     * 将构造方法私有化，不允许外界直接创建对象
     */
    private HungryManImplementation(){}

    /**
     * 创建类的唯一实例，使用 private static final 来修饰
     * 思考点：
     *  1.这个实例什么时候加载？
     *      答：java虚拟机类加载的时候自动实例化static修饰的变量
     *  2.为什么使用private
     *      答：不允许通过 类名.instance 方式再次实例化
     */
    private static final HungryManImplementation instance = new HungryManImplementation();

    /**
     * 对外提供一个公共的用于获取实例的方法（public 修饰）
     * @return 唯一实例
     */
    public static HungryManImplementation getInstance(){
        return instance ;
    }
}
