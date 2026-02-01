package com.manali.observerPattern.observable.pullStrategy;

import com.manali.observerPattern.observer.pullStrategy.WeatherObserver;

public interface WeatherObservable {

    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();

    void setWeatherReadings(float temp, float humidity,  float pressure);
}
