package com.kyeljmd.notes.dp.observer.observers.impl;

import com.kyeljmd.notes.dp.observer.observers.DisplayElement;
import com.kyeljmd.notes.dp.observer.observers.WeatherDisplay;
import com.kyeljmd.notes.dp.observer.subject.WeatherSubject;

/**
 * @author kyel
 */
public class ForecastDisplay implements WeatherDisplay,DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherSubject weatherSubject;

    public ForecastDisplay(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerDisplay(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("@>>>Forecast Display");
        System.out.println("Temperature: " + temperature + " humidity "+ humidity+ " pressure "+ pressure);
    }
}
