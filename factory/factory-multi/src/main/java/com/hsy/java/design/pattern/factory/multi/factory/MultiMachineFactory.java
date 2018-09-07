package com.hsy.java.design.pattern.factory.multi.factory;

import com.hsy.java.design.pattern.factory.multi.product.Bike;
import com.hsy.java.design.pattern.factory.multi.product.Car;
import com.hsy.java.design.pattern.factory.multi.product.Machine;
import com.hsy.java.design.pattern.factory.multi.product.Truck;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path java-design-pattern/com.hsy.java.design.pattern.method
 * @date 2018/1/30 16:01
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class MultiMachineFactory {
    /**
     * 造自行车
     */
    public static Machine createBike() {
        return new Bike();
    }

    /**
     * 造小汽车
     */
    public static Machine createCar() {
        return new Car();
    }

    /**
     * 造卡车
     */
    public static Machine createTruck() {
        return new Truck();
    }
}
