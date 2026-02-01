package com.manali.observerPattern.observer.pullStrategy;

import com.manali.observerPattern.observable.WeatherData;

//observer interface - defines update method
public interface WeatherObserver {
    void update();
}
