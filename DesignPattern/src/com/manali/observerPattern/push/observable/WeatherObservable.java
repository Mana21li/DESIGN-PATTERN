package com.manali.observerPattern.push.observable;

import com.manali.observerPattern.push.observer.WeatherObserver;

//Defines method for managing observers and notifying them of changes
public interface WeatherObservable {

    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();

    void setWeatherReadings(float temp, float humidity,  float pressure);
}
