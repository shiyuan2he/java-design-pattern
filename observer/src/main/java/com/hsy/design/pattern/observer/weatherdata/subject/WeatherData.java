package com.hsy.design.pattern.observer.weatherdata.subject;

import com.google.common.collect.Lists;
import com.hsy.design.pattern.observer.weatherdata.observer.IObserver;

import java.util.List;

public class WeatherData implements ISubject{
    private List<IObserver> observerList = Lists.newArrayList();
    private float temperature;
    private float humidity;
    private float pressure;
    @Override
    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        if(observerList.indexOf(observer)>0){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver(IObserver observer) {
        observer.callbackUpdate(temperature, humidity, pressure);
    }

    @Override
    public void notifyAllObserver() {
        observerList.stream().forEach(entity->entity.callbackUpdate(temperature, humidity, pressure));
    }

    public void changeData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyAllObserver();
    }
}
