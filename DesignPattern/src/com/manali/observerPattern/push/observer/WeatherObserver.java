package com.manali.observerPattern.push.observer;

import com.manali.observerPattern.push.observable.WeatherData;

//observer interface - defines update method
public interface WeatherObserver {
    void update(WeatherData weatherData);
}
