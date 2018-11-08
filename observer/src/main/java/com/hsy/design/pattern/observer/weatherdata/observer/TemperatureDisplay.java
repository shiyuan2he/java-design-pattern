package com.hsy.design.pattern.observer.weatherdata.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TemperatureDisplay implements IObserver, IDisplayElement{
    private float temperature;
    @Override
    public void display() {
        log.info("当前温度是：{}", temperature);
    }

    @Override
    public void callbackUpdate(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
    }
}
