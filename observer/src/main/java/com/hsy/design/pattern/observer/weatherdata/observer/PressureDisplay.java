package com.hsy.design.pattern.observer.weatherdata.observer;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class PressureDisplay implements IObserver, IDisplayElement{
    private float pressure;
    @Override
    public void display() {
        log.info("当前气压是：{}", pressure);
    }

    @Override
    public void callbackUpdate(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
    }
}
