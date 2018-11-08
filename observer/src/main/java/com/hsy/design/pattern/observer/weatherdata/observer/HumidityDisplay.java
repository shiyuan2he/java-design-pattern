package com.hsy.design.pattern.observer.weatherdata.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HumidityDisplay implements IObserver, IDisplayElement{
    private float humidity;
    @Override
    public void display() {
        log.info("当前湿度是：{}", humidity);
    }

    @Override
    public void callbackUpdate(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
    }
}
