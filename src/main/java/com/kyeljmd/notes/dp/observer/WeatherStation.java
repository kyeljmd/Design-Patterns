package com.kyeljmd.notes.dp.observer;

import com.kyeljmd.notes.dp.observer.observers.impl.CurrentConditionDisplay;
import com.kyeljmd.notes.dp.observer.observers.impl.ForecastDisplay;
import com.kyeljmd.notes.dp.observer.observers.impl.StatisticsDisplay;
import com.kyeljmd.notes.dp.observer.subject.impl.WeatherData;

/**
 * @author kyel
 */
public class WeatherStation {

    public static void main(String[]  args) {

        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(1.2f,2.3f,4.4f);
        weatherData.notifyDisplays();

    }


}
