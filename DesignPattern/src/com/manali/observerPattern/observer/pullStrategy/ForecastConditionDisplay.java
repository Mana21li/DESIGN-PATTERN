package com.manali.observerPattern.observer.pullStrategy;

import com.manali.observerPattern.observable.pullStrategy.WeatherObservable;

public class ForecastConditionDisplay implements WeatherObserver {

    public ForecastConditionDisplay(WeatherObservable weatherStation) {
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Forecast WeatherData updated");
    }
}
