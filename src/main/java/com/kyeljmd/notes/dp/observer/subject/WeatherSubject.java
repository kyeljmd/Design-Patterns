package com.kyeljmd.notes.dp.observer.subject;

import com.kyeljmd.notes.dp.observer.observers.WeatherDisplay;

/**
 * @author kdavid   1/31/2017.
 */
public interface WeatherSubject {

    void registerDisplay(WeatherDisplay weatherDisplay);
    void removeDisplay(WeatherDisplay weatherDisplay);
    void notifyDisplays();

}
