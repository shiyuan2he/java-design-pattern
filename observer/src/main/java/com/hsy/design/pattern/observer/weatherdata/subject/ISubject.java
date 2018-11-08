package com.hsy.design.pattern.observer.weatherdata.subject;

import com.hsy.design.pattern.observer.weatherdata.observer.IObserver;

public interface ISubject {
    /**
     * @description <p>注册成为观察者</p>
     * @param observer 被注册的观察者
     * @author heshiyuan
     * @dateTime 2018/11/8 17:13
     * @copyright Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
     *  I'm glad to share my knowledge with you all.
     *  @price 3毛    微信：hewei1109
     */
    void addObserver(IObserver observer);
    /**
     * @description <p>移除此观察者</p>
     * @param observer 被移除的观察者
     * @author heshiyuan
     * @dateTime 2018/11/8 17:14
     * @copyright Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
     *  I'm glad to share my knowledge with you all.
     *  @price 3毛    微信：hewei1109
     */
    void removeObserver(IObserver observer);
    /**
     * @description <p>通知此观察者</p>
     * @param observer 被通知得观察者
     * @author heshiyuan
     * @dateTime 2018/11/8 17:14
     * @copyright Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
     *  I'm glad to share my knowledge with you all.
     *  @price 3毛    微信：hewei1109
     */
    void notifyObserver(IObserver observer);
    /**
     * @description <p>通知所有得观察者</p>
     * @author heshiyuan
     * @dateTime 2018/11/8 17:14
     * @copyright Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
     *  I'm glad to share my knowledge with you all.
     *  @price 3毛    微信：hewei1109
     */
    void notifyAllObserver();
}
