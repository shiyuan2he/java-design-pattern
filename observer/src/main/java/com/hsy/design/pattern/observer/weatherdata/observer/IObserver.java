package com.hsy.design.pattern.observer.weatherdata.observer;

public interface IObserver {
    /**
     * @description <p>主题更新时候，回调观察者得方法</p>
     * @author heshiyuan
     * @dateTime 2018/11/8 16:59
     * @copyright Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
     *  I'm glad to share my knowledge with you all.
     *  @price 3毛    微信：hewei1109
     */
    void callbackUpdate(float temperature, float humidity, float pressure);
}
