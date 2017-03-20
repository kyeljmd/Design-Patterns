package com.kyeljmd.notes.dp.observer.subject.impl;

import com.kyeljmd.notes.dp.observer.observers.WeatherDisplay;
import com.kyeljmd.notes.dp.observer.subject.WeatherSubject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kdavid
 */
public class WeatherData implements WeatherSubject {

    private float temperature;
    private float humidity;
    private float pressure;

    private List<WeatherDisplay> displays;

    public WeatherData() {
        displays = new ArrayList<>();
    }

    public void measurementsChanged() {
        notifyDisplays();
    }

    public void registerDisplay(WeatherDisplay weatherDisplay) {
        displays.add(weatherDisplay);
    }

    public void removeDisplay(WeatherDisplay weatherDisplay) {
        int index = displays.indexOf(weatherDisplay);
        if(index > 0) {
            displays.remove(index);
        }
    }

    @Override
    public void notifyDisplays() {
        displays.forEach(display ->  {
            display.update(getTemperature(),getHumidity(),getPressure());
        });
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
