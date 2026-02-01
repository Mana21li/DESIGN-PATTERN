package com.manali.observerPattern.observer.pushStrategy;

import com.manali.observerPattern.observable.WeatherData;

//observer interface - defines update method
public interface WeatherObserver {
    void update(WeatherData weatherData);
}
