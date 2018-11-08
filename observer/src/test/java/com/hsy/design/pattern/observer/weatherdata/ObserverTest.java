package com.hsy.design.pattern.observer.weatherdata;

import com.hsy.design.pattern.observer.weatherdata.observer.HumidityDisplay;
import com.hsy.design.pattern.observer.weatherdata.observer.PressureDisplay;
import com.hsy.design.pattern.observer.weatherdata.observer.TemperatureDisplay;
import com.hsy.design.pattern.observer.weatherdata.subject.WeatherData;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
@Slf4j
public class ObserverTest {

    @Test
    public void testObserver(){
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();
        PressureDisplay pressureDisplay = new PressureDisplay();

        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(temperatureDisplay);
        weatherData.addObserver(humidityDisplay);
        weatherData.addObserver(pressureDisplay);

        //
        temperatureDisplay.display();
        humidityDisplay.display();
        pressureDisplay.display();
        log.info("data change -----------------------");
        weatherData.changeData(1, 2, 3);
        temperatureDisplay.display();
        humidityDisplay.display();
        pressureDisplay.display();

        log.info("data change -----------------------");
        weatherData.changeData(4, 5, 6);
        temperatureDisplay.display();
        humidityDisplay.display();
        pressureDisplay.display();
    }
}